import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Save extends Reader {
    
    public void save (){
   
    List<String[]> datos = Reader.readCSV("CSV/chicos - chicos.csv");

      try (PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(new FileOutputStream("CSV/chicos - chicos.csv"), StandardCharsets.UTF_8))) {
            for (String[] fila : datos) {
                pw.println(String.join(",", fila));
            }
            System.out.println("Archivo CSV actualizado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
