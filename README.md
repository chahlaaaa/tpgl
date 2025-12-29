# MyGitApp

## 📌 Description
MyGitApp est un projet Java simple basé sur **Maven**, réalisé dans le cadre du **TP Git**.  
L’objectif de ce projet est d’apprendre les bases de Git :  
- initialisation d’un dépôt  
- gestion des commits  
- utilisation des branches  
- collaboration avec Git et GitHub  

---

## 🛠️ Technologies utilisées
- **Java**
- **Maven**
- **Git**
- **Eclipse IDE**

---

## 📁 Structure du projet
MyGitApp/
├─ src/
│ ├─ main/java/com/l3/gl/
│ │ ├─ model/
│ │ │ ├─ User.java
│ │ │ └─ Product.java
│ │ ├─ view/
│ │ │ └─ Ui.java
│ │ └─ controller/
│ │ └─ Controller.java
│ └─ test/java
├─ pom.xml
├─ .gitignore
└─ README.md




---

## 🚀 Installation et exécution

### 1️⃣ Cloner le projet
```bash
git clone <repository-url>
cd MyGitApp




2️⃣ Compiler le projet avec Maven
mvn clean compile

3️⃣ Exécuter l’application
mvn exec:java


(ou lancer la classe Ui.java depuis Eclipse)

🌿 Gestion des branches

main : branche principale

feature/view-design : interface utilisateur

feature/model-implementation : modèle de données

feature/controller : logique de contrôle

👥 Travail collaboratif

Chaque fonctionnalité est développée dans une branche dédiée, puis intégrée à la branche principale à l’aide de git merge ou via une Pull Request sur GitHub.

📄 Auteur

Nom : شهلة

Formation : Informatique / Génie Logiciel

📝 Remarque

Les fichiers générés automatiquement (target/, fichiers Eclipse, etc.) sont ignorés grâce au fichier .gitignore.
git add README.md
git commit -m "Add project README file"
