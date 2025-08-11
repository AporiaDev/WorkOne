import java.util.*;


public class Eliminar extends Reader{

    public List<String[]> clean(String codigo) {
        List<String[]> datos = Reader.readCSV("CSV/chicos - chicos.csv");
        datos.removeIf(fila -> fila[0].equals(codigo));
        return datos;
}

    
}
    

