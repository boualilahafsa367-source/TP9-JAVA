
package com.example.tp9;

// Exception personnalisee pour les utilisateurs invalides
public class InvalidUserException extends Exception {

    // Constructeur qui recoit un message d'erreur
    public InvalidUserException(String message) {
        super(message);
    }

    // Constructeur qui recoit un message et la cause de l'erreur
    public InvalidUserException(String message, Throwable cause) {
        super(message, cause);
    }
}

