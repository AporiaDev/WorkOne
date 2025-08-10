import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public static List<String[]> readCSV(String routeArchive) {
        List<String[]> datos = new ArrayList<>();
        String line;

        try (BufferedReader bf = new BufferedReader(
                new InputStreamReader(new FileInputStream(routeArchive), StandardCharsets.UTF_8))) {

            // bf.readLine(); // Descomentar si quieres ignorar encabezados

            while ((line = bf.readLine()) != null) {
                String[] values = line.split(",");
                datos.add(values); // Guardar la fila
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return datos;
    }
}
