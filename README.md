# Exercice 1 – Implémentation d'une calculatrice sécurisée

Figure 1 : Compilation et exécution de la calculatrice sécurisée.
<img width="1920" height="561" alt="image" src="https://github.com/user-attachments/assets/148f90f7-26bb-422d-99e1-10a867761417" />

Cet exercice consiste à développer une classe Calculator permettant d'effectuer des opérations mathématiques simples à travers deux méthodes : add() pour l'addition et divide() pour la division. Une vérification est intégrée dans la méthode divide() afin d'empêcher toute division par zéro. Lorsqu'un diviseur égal à zéro est détecté, une exception IllegalArgumentException est déclenchée pour signaler l'opération invalide. La classe principale Main permet de tester les différentes fonctionnalités de la calculatrice en réalisant une addition, une division valide et une division par zéro. Les exceptions sont interceptées à l'aide d'un bloc try-catch, ce qui permet d'afficher un message explicatif sans interrompre brutalement le programme. Cet exercice permet ainsi de comprendre comment prévenir les erreurs d'exécution et sécuriser les opérations à l'aide des exceptions Java.

# Exercice 2 – Lecture de fichiers et propagation (Throws)

Figure 2 : Compilation et exécution des méthodes de lecture de fichiers.
<img width="1920" height="721" alt="image" src="https://github.com/user-attachments/assets/f31c2397-20af-49be-a3bf-8fd5e8d97d53" />

Cet exercice a pour objectif de manipuler les exceptions vérifiées (Checked Exceptions) lors de la lecture de fichiers texte. Pour cela, une classe FileReaderUtil est créée avec trois méthodes illustrant différentes techniques de gestion des ressources. La méthode readFile() utilise la clause throws IOException afin de propager l'exception à la méthode appelante, qui devient responsable de sa gestion. La méthode readFileSafely() utilise les blocs try-catch-finally pour intercepter les erreurs et garantir la fermeture du flux de lecture, même lorsqu'une exception survient. Enfin, la méthode readFileModern() adopte la syntaxe try-with-resources, introduite en Java 7, qui assure automatiquement la fermeture du fichier. La classe Main permet de tester ces trois approches sur un fichier texte contenant plusieurs lignes. Cet exercice met en évidence l'importance de la propagation des exceptions et de la bonne gestion des ressources lors des opérations d'entrée/sortie.

#  Exercice 3 – Création d'une exception personnalisée

Figure 3 : Compilation et exécution de la validation des utilisateurs avec une exception personnalisée.
<img width="1920" height="561" alt="image" src="https://github.com/user-attachments/assets/8baffa72-0c9a-4bfe-bccd-701c8dd565da" />

Dans cet exercice, nous avons créé une exception personnalisée appelée InvalidUserException en héritant de la classe Exception. Cette classe possède deux constructeurs permettant de transmettre un message d'erreur et, éventuellement, la cause initiale de l'exception. Ensuite, la classe User est développée pour représenter un utilisateur avec deux attributs : username et age. Son constructeur intègre des conditions de validation afin de vérifier que le nom d'utilisateur n'est ni nul ni vide et que l'âge est compris entre 0 et 120 ans. Lorsqu'une information ne respecte pas ces conditions, l'exception personnalisée est déclenchée à l'aide du mot-clé throw. Dans la classe principale Main, plusieurs tests sont réalisés : la création d'un utilisateur valide, la saisie d'un nom vide et la saisie d'un âge invalide. Les exceptions sont ensuite interceptées avec try-catch et leurs messages sont affichés dans la console. Cet exercice permet de comprendre l'héritage des exceptions et la création de règles de validation adaptées aux besoins d'une application.


# Exercice 4 – Journalisation des erreurs dans un fichier

Figure 4 : Compilation et exécution du programme final avec journalisation des erreurs.
<img width="1920" height="457" alt="image" src="https://github.com/user-attachments/assets/422b330b-5319-43aa-86a5-f2a48baa8c77" />

Cet exercice consiste à mettre en place un mécanisme de journalisation (Logging) afin de conserver une trace des erreurs rencontrées pendant l'exécution de l'application. Pour cela, nous avons créé la classe LoggerUtil, qui contient une méthode statique logError() chargée d'enregistrer les messages d'erreur dans un fichier nommé error.log. L'écriture est réalisée avec les classes BufferedWriter et FileWriter, en utilisant le mode ajout (true) pour conserver les anciens messages. La classe LocalDateTime permet d'ajouter automatiquement la date et l'heure à chaque erreur enregistrée. La structure try-with-resources garantit également la fermeture automatique du flux d'écriture. Dans la classe principale Main, nous avons regroupé les fonctionnalités précédentes en testant la création d'un utilisateur invalide et la lecture d'un fichier inexistant. L'exception personnalisée est interceptée, affichée dans la console, puis enregistrée dans le fichier de journalisation.
