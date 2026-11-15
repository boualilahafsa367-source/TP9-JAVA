
package com.example.tp9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class LoggerUtil {

    public static void logError(String message) {

        // Ouverture du fichier en mode ajout (true)
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("error.log", true))) {

            // Enregistrer la date, l'heure et le message d'erreur
            writer.write("[" + LocalDateTime.now() + "] " + message);
            writer.newLine();

        } catch (IOException e) {
            System.err.println("Impossible d'ecrire dans le fichier de log : "
                    + e.getMessage());
        }
    }
}
