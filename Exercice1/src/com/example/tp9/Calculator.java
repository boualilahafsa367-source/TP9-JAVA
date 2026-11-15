
package com.example.tp9;

public class Calculator {

    // Methode pour effectuer une addition
    public double add(double a, double b) {
        return a + b;
    }

    // Methode pour effectuer une division securisee
    public double divide(double a, double b) {

        // Verifier si le diviseur est egal a zero
        if (b == 0.0) {

            // Lancer une exception si la division est impossible
            throw new IllegalArgumentException(
                "Impossible de diviser par zero."
            );
        }

        // Effectuer la division si le diviseur est valide
        return a / b;
    }
}

