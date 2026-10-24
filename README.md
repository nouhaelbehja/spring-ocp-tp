# TP Spring — Injection de dépendances et principe OCP

## Description
Ce projet Maven Java illustre l'injection de dépendances avec Spring Framework et l'application du principe Ouvert/Fermé (OCP).

L'objectif est de pouvoir changer l'implémentation DAO sans modifier la logique métier.

## Technologies utilisées
- Java
- Spring Framework 5.3.30
- Maven
- JUnit 4
- IntelliJ IDEA

## Fonctionnalités
- Injection de dépendances par constructeur
- Sélection d'un bean avec `@Primary`
- Configuration avec `@Bean`
- Sélection dynamique via `app.properties`
- Gestion des profils Spring (`dev`, `prod`)
- Traçabilité avec `@PostConstruct`
- Tests unitaires JUnit
- Injection de plusieurs DAO avec `List` et `Map`
- Configuration par variables d'environnement

## Structure du projet
- `dao` : interfaces et implémentations des sources de données
- `metier` : logique métier
- `config` : configurations Spring
- `Main.java` : point d'entrée de l'application
- `app.properties` : configuration de la source DAO

## Résultats attendus

| DAO | Résultat |
|---|---|
| DaoImpl | 200.0 |
| DaoImpl2 | 300.0 |
| DaoFile | 360.0 |
| DaoApi | 440.0 |

![Capture d'écran 2026-10-24 104114.png](../../Pictures/Screenshots/Capture%20d%27%C3%A9cran%202026-10-24%20104114.png)
![Capture d'écran 2026-10-24 104145.png](../../Pictures/Screenshots/Capture%20d%27%C3%A9cran%202026-10-24%20104145.png)
![Capture d'écran 2026-10-24 104342.png](../../Pictures/Screenshots/Capture%20d%27%C3%A9cran%202026-10-24%20104342.png)
![Capture d'écran 2026-10-24 104452.png](../../Pictures/Screenshots/Capture%20d%27%C3%A9cran%202026-10-24%20104452.png)
![Capture d'écran 2026-10-24 102106 - Copy.png](../../Pictures/Screenshots/Capture%20d%27%C3%A9cran%202026-10-24%20102106%20-%20Copy.png)
![Capture d'écran 2026-10-24 102939 - Copy.png](../../Pictures/Screenshots/Capture%20d%27%C3%A9cran%202026-10-24%20102939%20-%20Copy.png)
![Capture d'écran 2026-10-24 103010 - Copy.png](../../Pictures/Screenshots/Capture%20d%27%C3%A9cran%202026-10-24%20103010%20-%20Copy.png)
![Capture d'écran 2026-10-24 103223 - Copy.png](../../Pictures/Screenshots/Capture%20d%27%C3%A9cran%202026-10-24%20103223%20-%20Copy.png)
![Capture d'écran 2026-10-24 103540 - Copy.png](../../Pictures/Screenshots/Capture%20d%27%C3%A9cran%202026-10-24%20103540%20-%20Copy.png)
![Capture d'écran 2026-10-24 103800 - Copy.png](../../Pictures/Screenshots/Capture%20d%27%C3%A9cran%202026-10-24%20103800%20-%20Copy.png)
![Capture d'écran 2026-10-24 103837.png](../../Pictures/Screenshots/Capture%20d%27%C3%A9cran%202026-10-24%20103837.png)