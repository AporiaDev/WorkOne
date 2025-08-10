import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Reader {

    public void Read(String routeArchive){

        String line;
        
        try(BufferedReader bf = new BufferedReader(
            new InputStreamReader(new FileInputStream(routeArchive), StandardCharsets.UTF_8))){
            
            // Encabezados
            System.out.printf("%-10s %-6s %-35s %5s %7s%n", 
                  "Codigo", "Sexo", "Nombre", "Edad", "Ciudad");
            System.out.println("--------------------------------------------------------------------------");

            while ((line = bf.readLine()) != null){
                String [] values = line.split(",");
            }
        }catch(IOException e){
            System.out.println("Error al leer el archivo");
        }

    }
}