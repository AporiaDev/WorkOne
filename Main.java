import java.util.*;


public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("************************************");
        System.out.println("*                                  *");
        System.out.println("*         Menú Principal           *");
        System.out.println("*   Equipo: 0 Nombre: Bryan Silv   *");
        System.out.println("*                                  *");
        System.out.println("************************************");
        System.out.println("*     a.   Cargar Datos.           *");
        System.out.println("*     b.   Informe Especial.       *");
        System.out.println("*     c.   Operaciones             *");
        System.out.println("*     d.   Salir                   *");
        System.out.println("************************************");

        char option = sc.next().charAt(0);
        while(option != 'd'){

            switch (option){
                case 'a':
                    DataTable tabla = new DataTable();
                    tabla.Tabla();
                break;

                case 'b':
                    System.out.print(
                                "Ingrese la tabla que desea verificar: \n" +
                                "1. Grupos por edad \n" +
                                "2. Porcentajes en ciudades \n" +
                                "Seleccione una opción: "
                                    );
                    int optionInter = sc.nextInt();
                    sc.nextLine();

                    PercentajeControl contr = new PercentajeControl();
                    if(optionInter == 1){
                        contr.ControlGrupos();
                    }else{
                        contr.ControlCiudades();
                    }

                break;

                case 'c':

                    System.out.println("=== MENÚ CSV ===");
                    System.out.println("1. Agregar datos");
                    System.out.println("2. Editar datos");
                    System.out.println("3. Eliminar datos");
                    System.out.print("Seleccione una opción: ");
        
                    int opcion = sc.nextInt();
                    sc.nextLine();

                    if (opcion == 1) {
                        AgregarDataCSV valu = new AgregarDataCSV();
                        System.out.print("Ingrese los datos nuevos, separados por comas: ");
                        String data = sc.nextLine();
                        valu.agregar(data);
                    } 
                    else if (opcion == 2) {

                        Edit editar = new Edit();
                        
                        System.out.print("Ingrese el código: ");
                        String codigo = sc.nextLine();

                        System.out.print("Ingrese el sexo (M/F): ");
                        String sexo = sc.nextLine();

                        System.out.print("Ingrese el nombre: ");
                        String nombre = sc.nextLine();

                        System.out.print("Ingrese la edad: ");
                        String edad = sc.nextLine();

                        System.out.print("Ingrese la zona/ciudad: ");
                        String zona = sc.nextLine();

                        editar.editar(codigo,sexo,nombre,edad,zona);
                    } 
                    else if (opcion == 3) {
                        Eliminar limpiar = new Eliminar();
                        System.out.print("Ingrese el código a eliminar: ");
                        String codigo = sc.nextLine();
                        limpiar.clean(codigo);
                    } 
                    else {
                        System.out.println("Opción inválida.");
                    }
                break;
            case 'd':
                Save guardar = new Save();
                guardar.save();
                break;
            default:

                break;
            
        }
        System.out.println("************************************");
        System.out.println("*                                  *");
        System.out.println("*         Menú Principal           *");
        System.out.println("*   Equipo: 0 Nombre: Bryan Silv   *");
        System.out.println("*                                  *");
        System.out.println("************************************");
        System.out.println("*     a.   Cargar Datos.           *");
        System.out.println("*     b.   Informe Especial.       *");
        System.out.println("*     c.   Operaciones             *");
        System.out.println("*     d.   Salir                   *");
        System.out.println("************************************");

        option = sc.next().charAt(0);
       
        }
        sc.close();
    }
}
