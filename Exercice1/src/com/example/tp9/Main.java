
package com.example.tp9;

public class Main {

    public static void main(String[] args) {

        // Creer un objet de la classe Calculator
        Calculator calculatrice = new Calculator();

        // Test 1 : Addition
        System.out.println("=== Test de l'addition ===");

        double somme = calculatrice.add(17.5, 6.5);

        System.out.println("17.5 + 6.5 = " + somme);


        // Test 2 : Division valide
        System.out.println("\n=== Test de division valide ===");

        try {
            double resultat = calculatrice.divide(45, 5);

            System.out.println("45 / 5 = " + resultat);

        } catch (IllegalArgumentException e) {

            // Afficher le message si une exception est declenchee
            System.out.println("Erreur : " + e.getMessage());
        }


        // Test 3 : Division par zero
        System.out.println("\n=== Test de division par zero ===");

        try {
            double resultat = calculatrice.divide(28, 0);

            System.out.println("28 / 0 = " + resultat);

        } catch (IllegalArgumentException e) {

            // Intercepter l'exception sans arreter le programme
            System.out.println("Exception interceptee : "
                    + e.getMessage());
        }

        // Le programme continue apres la gestion de l'exception
        System.out.println("\nFin des tests.");
    }
}
