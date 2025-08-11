import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Save extends Reader {
    
    public void save (String routeArchive){
   
    List<String[]> datos = readCSV(routeArchive);

      try (PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(new FileOutputStream(routeArchive), StandardCharsets.UTF_8))) {
            for (String[] fila : datos) {
                pw.println(String.join(",", fila));
            }
            System.out.println("Archivo CSV actualizado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
