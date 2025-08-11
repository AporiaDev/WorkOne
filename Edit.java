import java.util.*;


public class Edit extends Reader {

    public List<String[]> editar(String codigo, String sexo, String nombre, String edad, String zona){
        List<String[]> datos = Reader.readCSV("CSV/chicos - chicos.csv");

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
