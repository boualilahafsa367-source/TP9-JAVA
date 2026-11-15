
package com.example.tp9;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        FileReaderUtil lecteur = new FileReaderUtil();

        String chemin = "Exercice2/texte.txt";

        // Test de la premiere methode
        System.out.println("=== Methode 1 : Throws ===");

        try {
            lecteur.readFile(chemin);
        } catch (IOException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        // Test de la deuxieme methode
        System.out.println("\n=== Methode 2 : Finally ===");

        lecteur.readFileSafely(chemin);

        // Test de la troisieme methode
        System.out.println("\n=== Methode 3 : Try-With-Resources ===");

        lecteur.readFileModern(chemin);
    }
}

