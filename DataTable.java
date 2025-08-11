import java.util.*;
public class DataTable extends Reader{
    
    public void Tabla(){

    List<String[]> datos = Reader.readCSV("CSV/chicos - chicos.csv");
    System.out.printf("%-10s %-6s %-35s %5s %7s%n",
    "Codigo", "Sexo", "Nombre", "Edad", "Ciudad");
    System.out.println("--------------------------------------------------------------------------");
        for (String[] columna : datos) {
                        System.out.printf("%-10s %-6s %-35s %5s %7s%n",
                            columna[0], columna[1], columna[2], columna[3], columna[4]);
        }
    }

}
