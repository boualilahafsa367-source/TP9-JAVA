
package com.example.tp9;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== DEBUT DU PROGRAMME TP9 ===");

        // Test de creation d'un utilisateur invalide
        try {
            new User("", 150);

        } catch (InvalidUserException e) {

            System.err.println("Echec de creation utilisateur : "
                    + e.getMessage());

            // Enregistrer l'erreur dans le fichier error.log
            LoggerUtil.logError(e.getMessage());
        }

        // Test de lecture d'un fichier inexistant
        FileReaderUtil readerUtil = new FileReaderUtil();

        readerUtil.readFileModern("inexistant.txt");

        System.out.println("=== FIN DU PROGRAMME TP9 ===");
    }
}
