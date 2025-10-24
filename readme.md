# 🧩 Service Web RESTful – TP Spring Data REST

Ce projet est une **API RESTful** développée avec **Spring Boot** et **Spring Data REST** dans le cadre d’un **travail pratique (TP)** sur les **services web RESTful**.  
Il illustre la génération automatique des endpoints CRUD pour les entités `Etudiant` et `Centre` sans implémenter manuellement de contrôleurs.

---

## 🚀 Structure du Projet
```
com.example.springdataresttp
┣ 📂 entities
┃ ┣ 📄 Etudiant.java
┃ ┣ 📄 Centre.java
┃ ┗ 📄 Genre.java
┣ 📂 repositories
┃ ┣ 📄 EtudiantRepository.java
┃ ┗ 📄 CentreRepository.java
┗ 📄 SpringDataRestTpApplication.java
```

---

## ⚙️ Technologies Utilisées
- ☕ **Java 17+**
- 🌱 **Spring Boot**
- 🧩 **Spring Data REST**
- 🧠 **Spring Data JPA**
- 🧱 **H2 Database (en mémoire)**
- 🧰 **Lombok**
- 🔧 **Maven**

---

## 🌐 Fonctionnalités

| Méthode | Endpoint | Description |
|----------|-----------|-------------|
| `GET` | `/students` | Récupère la liste de tous les étudiants |
| `GET` | `/students/{id}` | Récupère un étudiant par son ID |
| `POST` | `/students` | Ajoute un nouvel étudiant |
| `PUT` | `/students/{id}` | Met à jour un étudiant existant |
| `DELETE` | `/students/{id}` | Supprime un étudiant |
| `GET` | `/students/search/findEtudiantsByNom?nom={nom}` | Recherche un étudiant par son nom |
| `GET` | `/centres` | Récupère la liste des centres |

---

## 🧍‍♂️ Exemple de Données

```json
[
  { "id": 1, "nom": "Adnani", "prenom": "Morad", "genre": "Homme" },
  { "id": 2, "nom": "Sara", "prenom": "Benali", "genre": "Femme" }
]
```

---

## 🧪 Exécution du Projet

### 1️⃣ Cloner le dépôt
```bash
git clone https://github.com/Oussamoux1234/spring-data-rest-tp.git
cd spring-data-rest-tp
```

### 2️⃣ Ouvrir le projet dans ton IDE préféré  
*(IntelliJ IDEA, Eclipse ou VS Code)*

### 3️⃣ Lancer l’application
```bash
mvn spring-boot:run
```

### 4️⃣ Tester les endpoints avec Postman ou ton navigateur :
- 🔹 [http://localhost:8080/students](http://localhost:8080/students)
- 🔹 [http://localhost:8080/students/1](http://localhost:8080/students/1)
- 🔹 [http://localhost:8080/centres](http://localhost:8080/centres)
- 🔹 [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

---

## 📦 Exemple de JSON (Création / Mise à jour)
```json
{
  "nom": "Oussama",
  "prenom": "Essalmani",
  "genre": "Homme"
}
```

---

## ⚙️ Configuration H2
```properties
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:centredb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=create
```

---

## 🧰 Dépendances (pom.xml)
```xml
<dependencies>
    <!-- Spring Boot Starter Data REST -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-rest</artifactId>
    </dependency>

    <!-- Spring Boot Starter Data JPA -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- H2 Database -->
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>

    <!-- Lombok -->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.30</version>
        <scope>provided</scope>
    </dependency>

    <!-- Tests -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
```

---

## 🎯 Objectifs Pédagogiques
- Comprendre le fonctionnement du module **Spring Data REST**
- Générer automatiquement des endpoints REST à partir des **repositories JPA**
- Manipuler des entités liées (`Etudiant` ↔ `Centre`)
- Utiliser les annotations :
  - `@Entity`
  - `@RepositoryRestResource`
  - `@ManyToOne`, `@OneToMany`
  - `@Enumerated(EnumType.STRING)`
- Tester les API CRUD avec **Postman** ou **H2 Console**

---

## 👨‍💻 Auteur
**Oussama Essalmani**  
🎓 Étudiant à l’**EMSI – École Marocaine des Sciences de l’Ingénieur**  
💬 Projet réalisé dans le cadre du TP : *Création d’un Web Service RESTful avec Spring Data REST*  
📧 [LinkedIn – Profil Professionnel](#)
````
