# Laboratoire 1 du cours Programmation Orientée Objet

## 1. Environnement Java
### 1. JDK

Les programmes réalisés dans le cadre des laboratoires de POO devront pouvoir être compilés et exécutés au moyen de l’environnement JDK 17 (Java SE Standard Development Kit). Voir le document "Introduction à Java et IntelliJ" si vous n'avez pas encore la version 17 installée.

Pour vérifier la version de Java installée sur une machine exécuter la ligne de commande: ```java -version```.
- Compilation: ```javac NomDeFichier.java```
- Exécution: ```java NomDeClasse```
- Rem: NomDeClasse est le nom d’une classe contenant une méthode ```public static void main(String[] args)```, point d’entrée d’un programme. Cette classe doit être placée dans un fichier ```NomDeClasse.java```.

### 2. Documentation Java

La documentation du JDK 17 - dont notamment la spécification de l’interface de programmation d’application (API: Application Programming Interface) - est disponible en ligne aux adresses suivantes : https://docs.oracle.com/en/java/javase/17/ pour la documentation générale et https://docs.oracle.com/en/java/javase/17/docs/api/index.html pour la documentation de l'API.

Pour pouvoir travailler sans connexion Internet vous pouvez aussi télécharger la documentation ici : https://www.oracle.com/java/technologies/javase-jdk17-doc-downloads.html
### 3. Configuration

La variable d’environnement PATH doit référencer sur le répertoire bin où est installé Java (typiquement sur ```C:\Program Files\Java\jdk-17.x.x\bin``` sous Windows).

Ce répertoire doit être listé avant celui d’autres installations Java qui pourraient exister dans le système (pour éviter les confusions, le mieux est encore de les désinstaller si elles ne sont pas utilisées).
## 2. Hello World

Définir la classe HelloWorld dans un fichier ```HelloWorld.java``` (attention à respecter la casse):
```
public class HelloWorld
{
  public static void main(String[] args) 
  {
    int number;

    if (args.length == 0)
      number = 1;
    else
      number = Integer.parseInt(args[0]);

    for (int i = 0; i < number; i++)
      System.out.println(i + " Hello World!");
  }
}
```

Compiler cette classe (en ligne de commande): ```javac HelloWorld.java```

Exécuter le programme (en ligne de commande):
- Sans arguments: ```java HelloWorld```
- Avec un argument: ```java HelloWorld 10```

Que peut-on en déduire sur le paramètre args qui est transmis à la méthode main?
## 3. Nouvelle Star

En s’inspirant du programme ci-dessus, définir une application NouvelleStar de manière à obtenir les résultats:

1. ```java NouvelleStar```

    ```Il n’existe pas de candidats !```

2. ```java NouvelleStar Paul Jeanne Marie```

    ```
    Candidats: 
    #1 Paul
    #2 Jeanne
    #3 Marie

    150 votes: 
    .....................................................................................
    .................................................................

    Résultats: 
    29% Paul
    32% Jeanne
    38% Marie```

Indications:
- Pour définir un tableau d’entiers: int[] array = new int[size];
- Pour générer un nombre aléatoire utiliser une instance de la classe Random.

```java.util.Random random = new java.util.Random();```

```int value = random.nextInt(maximum); // génère une valeur dans l’intervalle [0, maximum[```

Imprimez le code source de votre programme dans un fichier PDF et rendez-le sur Cyberlearn.
