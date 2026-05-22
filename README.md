# Gestion de Comptes Bancaires

Ce projet est un exercice pratique en Java démontrant les principes de l'héritage orienté objet.

## Structure du Code

Le projet est composé d'une classe parente et de trois classes enfants :
- `Compte.java` : La classe de base contenant les attributs privés `account` (numéro de compte) et `balance` (solde), ainsi que leurs getters et setters.
- `CompteCourant.java`, `CompteEpargne.java`, `CompteProfessionnel.java` : Les classes enfants qui héritent de `Compte`.
- `Main.java` : Le point d'entrée du programme qui instancie les classes, affecte les valeurs et affiche le résultat dans la console.

## Exécution

Le projet a été développé avec **Java 21**.
Pour tester le code :
1. Importez le dossier du projet dans votre IDE (ex: IntelliJ IDEA).
2. Ouvrez le fichier `Main.java`.
3. Lancez l'exécution de la classe `Main`. Le résultat s'affichera directement dans la console.