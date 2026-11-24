# 🦁 ZooManagement – Java OOP Prosits

![Java](https://img.shields.io/badge/Java-17-orange)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-2026.1.3-blue)
![Top language](https://img.shields.io/github/languages/top/Maramm22/homeworkjava1)
![Last commit](https://img.shields.io/github/last-commit/Maramm22/homeworkjava1)
![Repo size](https://img.shields.io/github/repo-size/Maramm22/homeworkjava1)

**Developed by:** `Maram Azri` – ESPRIT<br>
**Coached by:** `Ghassen Klai`<br>
**Course:** Object-Oriented Design and Java Programming

## 📑 Table of Contents
- [About the Project](#-about-the-project)
- [Branches](#-branches)
- [Prosits Overview](#-prosits-overview)
- [Project Structure](#-project-structure)
- [How to Run](#-how-to-run)
- [Environment](#-environment)
- [Author](#-author)

## 📖 About the Project
As a newly recruited engineer at **ESPRIT TECH**, the mission is to build a Java console application that digitizes the management of a zoo.
The project grows prosit by prosit, from simple classes to inheritance, polymorphism, abstraction and exception handling.

## 🌿 Branches
| Branch | Content |
|---|---|
| `main` | Final version of the project (all prosits combined) |
| `prosit3` | Prosits 1 → 3: first classes, constructors, constant, zoo comparison |
| `prosit4` | Prosit 4: encapsulation and packages |
| `prosit5` | Prosit 5: inheritance (Aquatic, Terrestrial, Dolphin, Penguin) |
| `prosit6` | Prosit 6: polymorphism, abstract class, `equals()` |
| `prosit7` | Prosit 7: custom exceptions |

## 🧩 Prosits Overview
| Prosit | Instructions | Main concepts |
|---|---|---|
| 1 | 1 – 3 | Main class, variables, `Scanner` input with validation |
| 2 | 5 – 13 | Classes `Animal` and `Zoo`, objects, parameterized constructors, `toString()`, add / search / remove an animal |
| 3 | 14 – 16 | Constant `nbrCages`, `isZooFull()`, `compareZoo()` |
| 4 | 17 – 19 | `private` attributes, getters/setters with validation, packages |
| 5 | 20 – 24 | Inheritance, `super(...)`, `protected`, overriding `toString()` and `swim()` |
| 6 | 25 – 31 | Array of aquatic animals, polymorphism, `abstract` method, `instanceof`, `equals()` |
| 7 | 32 – 34 | Custom checked exceptions `ZooFullException` and `InvalidAgeException`, `try / catch / finally` |

## 🗂️ Project Structure
```
homeworkjava1
├── README.md
├── .gitignore
├── homeworkjava1.iml
├── .idea
│   ├── .gitignore
│   ├── misc.xml
│   ├── modules.xml
│   └── vcs.xml
└── src/tn/esprit/gestionzoo
    ├── entities
    │   ├── Animal.java
    │   ├── Aquatic.java        (abstract)
    │   ├── Dolphin.java
    │   ├── Penguin.java
    │   ├── Terrestrial.java
    │   └── Zoo.java
    ├── exceptions
    │   ├── InvalidAgeException.java
    │   └── ZooFullException.java
    └── main
        └── ZooManagement.java
```

## ▶️ How to Run
1. Clone the repository: `git clone https://github.com/Maramm22/homeworkjava1.git`
2. Open the `homeworkjava1` folder in IntelliJ IDEA (**File → Open**).
3. Check that the project SDK is Java 17 (**File → Project Structure → Project → SDK**).
4. Right-click `src/tn/esprit/gestionzoo/main/ZooManagement.java` → **Run 'ZooManagement.main()'**.
5. Enter a zoo name and a number of cages in the console.

To see the code of a specific prosit, switch branch: `git checkout prosit5` (for example).

### Example output (final version, 3 cages)
```
Simba was added.
Number of animals: 1
Invalid age: -2, Rex cannot be added.
Number of animals: 1
Flipper was added.
Number of animals: 2
Pingu was added.
Number of animals: 3
The zoo is full, Bubbles cannot be added.
Number of animals: 3
```

## 🛠️ Environment
- **JDK:** Java 17 (JetBrains Runtime `jbr-17.0.14`)
- **IDE:** IntelliJ IDEA 2026.1.3
- **Build:** IntelliJ native project (no Maven / Gradle)
- **External libraries:** none

## 👩‍💻 Author
**Maram Azri** – engineering student at ESPRIT
- GitHub: [Maramm22](https://github.com/Maramm22)