
# 🧩 Service Web RESTful – TP Spring Data REST + Clients API

Ce projet est composé de **2 applications** Spring Boot :

✅ **Serveur Spring Data REST** → Fournit des APIs REST CRUD automatiquement  
✅ **Client Spring** → Consomme les APIs du serveur en utilisant :
- RestTemplate
- WebClient (WebFlux)
- FeignClient (OpenFeign)

Ce TP démontre l’intégration **Client → Serveur** dans une architecture RESTful.

---

## 📌 Architecture Globale

```

Client API Spring Boot
┌───────────────┬─────────────────┬────────────────┐
│ RestTemplate  │ WebClient       │ Feign Client   │
└───────────────┴─────────────────┴────────────────┘
↓ Consommation API
┌───────────────────────────────┐
│ Serveur Spring Data REST      │
│ CRUD Etudiants / Centres      │
└───────────────────────────────┘
↓
🗄 Base H2

```

---

## 🏗 Structure du Projet (Serveur)

```

spring-data-rest-server
┣ 📂 entities
┃ ┣ 📄 Etudiant.java
┃ ┣ 📄 Centre.java
┃ ┗ 📄 Genre.java
┣ 📂 repositories
┃ ┣ 📄 EtudiantRepository.java
┃ ┗ 📄 CentreRepository.java
┗ 📄 SpringDataRestServerApplication.java

```

### ✨ Endpoints Serveur générés par Spring Data REST

| Méthode | Endpoint | Description |
|--------|----------|-------------|
| GET | `/etudiants` | liste étudiants |
| GET | `/etudiants/{id}` | récupérer étudiant |
| POST | `/etudiants` | ajouter étudiant |
| PUT | `/etudiants/{id}` | modifier étudiant |
| DELETE | `/etudiants/{id}` | supprimer étudiant |
| GET | `/etudiants/search/findEtudiantsByNom?nom=X` | recherche |

---

## 🛠 Structure du Projet (Client)

```

spring-data-rest-client
┣ 📂 resttemplate
┃ ┣ 📄 EtudiantClientService.java
┃ ┗ 📄 EtudiantClientController.java
┣ 📂 webclient
┃ ┣ 📄 EtudiantWebClient.java
┃ ┗ 📄 WebClientController.java
┣ 📂 feign
┃ ┣ 📄 EtudiantClient.java
┃ ┗ 📄 EtudiantController.java
┗ 📄 ClientApplication.java

````

---

## 🎯 Fonctionnalités Clients

| Client | Exemple d’endpoint du **client** |
|--------|--------------------------------|
| **RestTemplate** | http://localhost:8081/etudiants |
| **WebClient** | http://localhost:8081/all |
| **FeignClient** | http://localhost:8081/api/etudiants |

Le client appelle **le serveur Data REST** sur `http://localhost:8080`

---

## 🔌 Dépendances Serveur

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-rest</artifactId>
</dependency>
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
````

---

## 🔌 Dépendances Clients

```xml
<!-- RestTemplate & WebClient -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webflux</artifactId>
</dependency>

<!-- OpenFeign -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>

<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-dependencies</artifactId>
            <version>2023.0.3</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

---

## 🧪 Exécution des 2 Apps

✅ 1️⃣ Lancer le **Serveur**

```bash
cd spring-data-rest-server
mvn spring-boot:run
```

➡ Tester : [http://localhost:8080/etudiants](http://localhost:8080/etudiants)

✅ 2️⃣ Lancer le **Client API**

```bash
cd spring-data-rest-client
mvn spring-boot:run
```

➡ Tester :

* RestTemplate → `http://localhost:8081/etudiants`
* WebClient → `http://localhost:8081/all`
* Feign → `http://localhost:8081/api/etudiants`

---

## 🎓 Objectifs Pédagogiques

✔ Comprendre Spring Data REST et ses endpoints automatiques
✔ Consommer un service REST avec **3 clients différents**
✔ Manipulation JSON / HATEOAS
✔ Communication inter-services

---

## 👨‍💻 Auteur

**Oussama Essalmani**
Étudiant à l’EMSI
Projet réalisé dans le cadre du TP :
🎯 *Client & Serveur API avec Spring Data REST*

```



