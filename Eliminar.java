import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Eliminar {

    public void clean(String codigo) {

        List<String[]> datos = Reader.readCSV("CSV/chicos - chicos.csv");
        
        boolean eliminado = datos.removeIf(
            fila -> fila[0].trim().equalsIgnoreCase(codigo.trim())
        );

        if (eliminado) {
    
            try (PrintWriter pw = new PrintWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("CSV/chicos - chicos.csv"), StandardCharsets.UTF_8))) {

                for (String[] fila : datos) {
                    pw.println(String.join(",", fila));
                }
                System.out.println("Registro eliminado correctamente.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No se encontró el código: " + codigo);
        }
    }
}

    

