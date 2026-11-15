
package com.example.tp9;

public class User {

    private String username;
    private int age;

    // Constructeur avec validation des informations
    public User(String username, int age) throws InvalidUserException {

        // Verifier que le nom n'est pas vide
        if (username == null || username.trim().isEmpty()) {
            throw new InvalidUserException("Le nom d'utilisateur ne peut pas etre vide.");
        }

        // Verifier que l'age est valide
        if (age < 0 || age > 120) {
            throw new InvalidUserException("L'age doit etre compris entre 0 et 120 ans.");
        }

        this.username = username;
        this.age = age;
    }

    // Retourner le nom d'utilisateur
    public String getUsername() {
        return username;
    }

    // Retourner l'age
    public int getAge() {
        return age;
    }
}
