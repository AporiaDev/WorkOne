import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        List<String[]> datos = Reader.readCSV("CSV/chicos - chicos.csv");
        List<Integer> ciudadInt = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("************************************");
        System.out.println("*                                  *");
        System.out.println("*         Menú Principal           *");
        System.out.println("*   Equipo: XX Nombre: Tu nombre   *");
        System.out.println("*                                  *");
        System.out.println("************************************");
        System.out.println("*     a.   Cargar Datos.           *");
        System.out.println("*     b.   Informe Especial.       *");
        System.out.println("*     c.   Operaciones             *");
        System.out.println("*     d.   Salir                   *");
        System.out.println("************************************");

        char option = sc.next().charAt(0);
        while(option != 'd'){
           
            switch (option) {
                case 'a':
                    System.out.printf("%-10s %-6s %-35s %5s %7s%n",
                        "Codigo", "Sexo", "Nombre", "Edad", "Ciudad");
                    System.out.println("--------------------------------------------------------------------------");
                    for (String[] columna : datos) {
                        System.out.printf("%-10s %-6s %-35s %5s %7s%n",
                            columna[0], columna[1], columna[2], columna[3], columna[4]);
                        }
                break;

            case 'b':

            ////////////////////////////////////////////////////////////////////////Tabla de grupos
            
                        
            
                    
             /////////////////////////////////////////////////////////////////////// Porcentajes
                    int contBucaramanga = 0;
                    int contGiron = 0;
                    int contFloridablanca= 0;  
                    int contPiedecuesta = 0;
                    int contOtros = 0;

                    for (String[] columna : datos) {
                        String ciudad = columna[4]; // Columna "Ciudad"
                        ciudadInt.add(Integer.parseInt(ciudad));
                    }
                    for(int i = 0 ; i < ciudadInt.size(); i++){
                        
                        if(ciudadInt.get(i) == 1){
                            contBucaramanga += 1;
                        }else if(ciudadInt.get(i) == 2){
                            contGiron += 1;
                        }else if(ciudadInt.get(i) == 3){
                            contFloridablanca += 1;
                        }else if(ciudadInt.get(i) == 4){
                            contPiedecuesta += 1;
                        }else{
                            contOtros += 1;
                        }

                    }

                    System.out.printf("%-15s %10s%n", "Ciudad", "Porcentaje");
                    System.out.println("----------------------------------");
                    System.out.printf("%-15s %9.2f%%%n", "Bucaramanga", (contBucaramanga * 100.0) / ciudadInt.size());
                    System.out.printf("%-15s %9.2f%%%n", "Giron", (contGiron * 100.0) / ciudadInt.size());
                    System.out.printf("%-15s %9.2f%%%n", "Floridablanca", (contFloridablanca * 100.0) / ciudadInt.size());
                    System.out.printf("%-15s %9.2f%%%n", "Piedecuesta", (contPiedecuesta * 100.0) / ciudadInt.size());
                    System.out.printf("%-15s %9.2f%%%n", "Otros", (contOtros * 100.0) / ciudadInt.size());
                
                ////////////////////////////////////////////////////////////////////

                break;
            case 'c':
                
                break;

            default:

                break;
            
        }
        option = sc.next().charAt(0);



}

        


    }
}
