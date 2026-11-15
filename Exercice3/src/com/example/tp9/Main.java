
package com.example.tp9;

public class Main {

    public static void main(String[] args) {

        // Test 1 : creation d'un utilisateur valide
        System.out.println("=== Test 1 : Utilisateur valide ===");

        try {
            User user1 = new User("Yasmine", 21);

            System.out.println("Nom : " + user1.getUsername());
            System.out.println("Age : " + user1.getAge());

        } catch (InvalidUserException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        // Test 2 : nom d'utilisateur vide
        System.out.println("\n=== Test 2 : Nom vide ===");

        try {
            User user2 = new User("   ", 19);

            System.out.println("Utilisateur cree : " + user2.getUsername());

        } catch (InvalidUserException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        // Test 3 : age invalide
        System.out.println("\n=== Test 3 : Age invalide ===");

        try {
            User user3 = new User("Amine", 135);

            System.out.println("Utilisateur cree : " + user3.getUsername());

        } catch (InvalidUserException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
