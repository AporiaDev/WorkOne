import java.util.*;


public class Eliminar extends Reader{


    public List<String[]> Eliminar (String routeArchive){
        List<String[]> datos = readCSV(routeArchive);
        Scanner scanner = new Scanner(System.in);

        String codigo = scanner.nextLine();


        for(String[] fila : datos){
            if(fila[0].equals(codigo)){
                fila[1] = null;
                fila[2] = null;
                fila[3] = null;
                fila[4] = null;
            }
        }
        return datos;
    }
    
}
    

