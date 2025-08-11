import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class AgregarDataCSV extends Reader{

    public List<String[]> agregar(String routeArchive) {
        List<String[]> datos = readCSV(routeArchive);
        Scanner scanner = new Scanner(System.in);

        try (FileWriter fw = new FileWriter(routeArchive, true)) { 
            System.out.print("Ingrese los datos nuevos, separados por comas: ");
            String data = scanner.nextLine();

            fw.append("\n" + data); 

            System.out.println("Registro agregado correctamente.");
            datos.add(data.split(",")); 

        } catch (IOException e) {
            e.printStackTrace();
        }

        return datos;
    }
}
