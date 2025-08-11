import java.util.*;

public class PercentajeControl {

    List<String[]> datos = Reader.readCSV("CSV/chicos - chicos.csv");
    List<Integer> ciudadInt = new ArrayList<>();
    List<Integer> edadInt = new ArrayList<>();
    List<Character> sexoArray = new ArrayList<>();
    
    public void ControlGrupos(){

        int contadorG1 = 0;
        int contadorG2 = 0;
        int contadorG3 = 0;
        int contMaleG1 = 0;
        int contFemaleG1 = 0;
        int contMaleG2 = 0;
        int contFemaleG2 = 0;
        int contMaleG3 = 0;
        int contFemaleG3 = 0;
                    
        for(String[] columna : datos){
            String edad = columna[3];
            edadInt.add(Integer.parseInt(edad));
            String sexo = columna[1];
            sexoArray.add(sexo.charAt(0));
            }

        for(int i = 0; i < edadInt.size(); i++){
            if (edadInt.get(i) <=  5){
                if(sexoArray.get(i) == 'F'){
                    contFemaleG1 += 1;
                }else{
                    contMaleG1 += 1;
                }contadorG1 += 1;

                }else if(edadInt.get(i) > 5 && edadInt.get(i) <= 10){
                    if(sexoArray.get(i) == 'F'){
                        contFemaleG2 += 1;
                    }else{
                        contMaleG2 += 1;
                    }contadorG2 += 1;

                }else if(edadInt.get(i) > 10){
                    if(sexoArray.get(i) == 'F'){
                        contFemaleG3 += 1;
                    }else{
                        contMaleG3 += 1;
                    }contadorG3 += 1;
                }
        }


        System.out.printf("%-20s %10s %10s %10s%n", "Grupo", "Porcentaje", "Mujeres", "Hombres");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-20s %9.2f%%%10d%10d%n", 
        "Menores a 5 años", (contadorG1 * 100.0) / edadInt.size(), contFemaleG1, contMaleG1);
        System.out.printf("%-20s %9.2f%%%10d%10d%n", 
        "6 - 10 años", (contadorG2 * 100.0) / edadInt.size(), contFemaleG2, contMaleG2);
        System.out.printf("%-20s %9.2f%%%10d%10d%n", 
        "11 años en adelante", (contadorG3 * 100.0) / edadInt.size(), contFemaleG3, contMaleG3);
    
    }
    public void ControlCiudades(){
                       

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
                
    }

}

