package main;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Log {

  public static void registrarResultado (String resultado) {
    String archivo = "resultados_test.txt";

    try (BufferedWriter writer = new BufferedWriter(new BufferedWriter(new FileWriter(archivo, true)))) {
      writer.write(resultado);
      writer.newLine();
    } catch (Exception e) {
      System.err.println("Error al escribir en el archivo: " + e.getMessage());
    }
  }
}
