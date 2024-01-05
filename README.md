# Contact Manager

Ce projet Java est une application de gestion de contacts orientée objet.

## Classes

### `Contact`

La classe `Contact` représente un contact avec les propriétés suivantes :
- `id` : Identifiant du contact.
- `name` : Nom du contact.
- `email` : Adresse e-mail du contact.
- `address` : Adresse du contact.
- `age` : Âge du contact.

La classe a les méthodes suivantes :
- `toString()` : Retourne une représentation textuelle du contact.

### `ContactManager`

La classe `ContactManager` est responsable de la gestion des contacts. Elle inclut les méthodes suivantes :
- `add()` : Ajoute un nouveau contact.
- `search()` : Recherche un contact par son identifiant.
- `update()` : Met à jour les informations d'un contact.
- `remove()` : Supprime un contact.
- `show()` : Affiche tous les contacts.

## Exécution

Le programme principal se trouve dans la classe `Main`. Il utilise un menu simple pour permettre à l'utilisateur d'interagir avec le gestionnaire de contacts.

## Utilisation

1. Clonez le dépôt : `git clone https://github.com/votre-utilisateur/votre-repo.git`
2. Compilez le code : `javac Main.java`
3. Exécutez le programme : `java Main`
