import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class AgregarDataCSV extends Reader{

    public List<String[]> agregar(String data) {
        List<String[]> datos = Reader.readCSV("CSV/chicos - chicos.csv");
    
        try (FileWriter fw = new FileWriter("CSV/chicos - chicos.csv", true)) { 
            fw.append("\n" + data); 
            System.out.println("Registro agregado correctamente.");
            datos.add(data.split(",")); 

        } catch (IOException e) {
            e.printStackTrace();
        }

        return datos;
    }
}
