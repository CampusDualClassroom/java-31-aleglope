package com.campusdual.classroom;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercise31 {

    public static void main(String[] args) {
        // Ruta del archivo
        Path filePath = Paths.get("src/main/resources/lorem.txt");

        try {
            // Leer todas las líneas del archivo
            List<String> lines = Files.readAllLines(filePath);

            // Imprimir las líneas del archivo
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Control de errores en caso de que el archivo no pueda ser leído
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
