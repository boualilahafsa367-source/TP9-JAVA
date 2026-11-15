
package com.example.tp9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtil {

    // Methode 1 : propagation de l'exception avec throws
    public void readFile(String filePath) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String line;

        // Lire le fichier ligne par ligne
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }

    // Methode 2 : gestion des exceptions avec finally
    public void readFileSafely(String filePath) {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());

        } finally {

            // Fermer le fichier meme en cas d'exception
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                System.err.println("Erreur lors de la fermeture du fichier : " + ex.getMessage());
            }
        }
    }

    // Methode 3 : gestion moderne avec try-with-resources
    public void readFileModern(String filePath) {

        // Le fichier sera automatiquement ferme
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("Erreur d'E/S avec le fichier : " + e.getMessage());
        }
    }
}

