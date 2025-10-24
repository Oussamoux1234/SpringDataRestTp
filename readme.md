# 🧩 Service Web RESTful – TP Spring Boot

Ce projet est une **API RESTful** développée avec **Spring Boot** dans le cadre d’un **travail pratique (TP)** sur les **services web**.  
Il illustre la création, la lecture, la mise à jour et la suppression (CRUD) de données utilisateur selon le **style architectural REST**.

---

## 🚀 Structure du Projet

```
.emsi.restfull_tp
┣ 📂 controller
┃ ┗ 📄 UserController.java
┣ 📂 model
┃ ┗ 📄 User.java
┗ 📂 service
┃ ┗ 📄 UserService.java
```

---

## ⚙️ Technologies Utilisées

- ☕ **Java 17+**
- 🌱 **Spring Boot** (Spring Web)
- 🧩 **Lombok**
- 🔧 **Maven**
- 🌐 **Principes RESTful**

---

## 🧱 Fonctionnalités

| Méthode | Endpoint | Description |
|----------|-----------|-------------|
| `GET` | `/users` | Récupère la liste de tous les utilisateurs |
| `GET` | `/user/{id}` | Récupère un utilisateur par son ID |
| `POST` | `/add` | Ajoute un nouvel utilisateur |
| `PUT` | `/update/{id}` | Met à jour un utilisateur existant |
| `DELETE` | `/supp?id={id}` | Supprime un utilisateur par ID |

---

## 🧍‍♂️ Exemple de Données

```json
[
  { "id": 1, "nom": "Mohammed", "mail": "mhd@mail.com" },
  { "id": 2, "nom": "Moad", "mail": "moad@mail.com" },
  { "id": 3, "nom": "Sana", "mail": "sana@mail.com" },
  { "id": 4, "nom": "Ahlam", "mail": "ahlam@mail.com" }
]
```

---

## 🧪 Exécution du Projet

1. **Cloner le dépôt**

   ```bash
   git clone https://github.com/Oussamoux1234/rest_tp.git
   cd rest_tp
   ```

2. **Ouvrir le projet** dans ton IDE préféré (IntelliJ IDEA, Eclipse ou VS Code)

3. **Lancer l’application**

   ```bash
   mvn spring-boot:run
   ```

4. **Tester les endpoints** avec Postman, cURL ou ton navigateur :

   - [http://localhost:8080/users](http://localhost:8080/users)
   - [http://localhost:8080/user/1](http://localhost:8080/user/1)

---

## 📦 Exemple de JSON (Ajout / Mise à jour)

```json
{
  "id": 5,
  "nom": "Oussama",
  "mail": "oussama@mail.com"
}
```

---

## 🧰 Dépendances (pom.xml)

```xml
<dependencies>
    <!-- Démarrage Web de Spring Boot -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Lombok pour simplifier le code -->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.30</version>
        <scope>provided</scope>
    </dependency>

    <!-- Outils de test Spring Boot -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
```

---

## 🎯 Objectifs Pédagogiques

- Comprendre les bases de l’**architecture REST**
- Créer une **API REST** avec **Spring Boot**
- Utiliser les principales annotations :
  - `@RestController`
  - `@GetMapping`
  - `@PostMapping`
  - `@PutMapping`
  - `@DeleteMapping`
- Gérer les échanges **JSON**
- Implémenter une couche **Service** sans base de données

---

## 👨‍💻 Auteur

**Oussama Essalmani**  
🎓 *Étudiant à l’EMSI – École Marocaine des Sciences de l’Ingénieur*  
📧 [Profil LinkedIn](https://www.linkedin.com/in/oussama-essalmani-a78aa7276/)  
💬 Projet réalisé dans le cadre du **TP : Développement d’un Service Web RESTful avec Spring Boot**

