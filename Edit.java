import java.util.*;


public class Edit extends Reader {

    public List<String[]> editar(String routeArchive){
        List<String[]> datos = readCSV(routeArchive);
        Scanner scanner = new Scanner(System.in);

        String codigo = scanner.nextLine();
        String sexo = scanner.nextLine();
        String nombre = scanner.nextLine();
        String edad = scanner.nextLine();
        String zona = scanner.nextLine();

        for(String[] fila : datos){
            if(fila[0].equals(codigo)){
                fila[1] = sexo;
                fila[2] = nombre;
                fila[3] = edad;
                fila[4] = zona;
            }
        }
        return datos;
    }
    
}
