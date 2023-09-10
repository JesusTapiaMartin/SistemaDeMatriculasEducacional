package Vista;
import java.util.Scanner;

public class menu {
    public static void interfazSME () {
        Scanner lector = new Scanner(System.in);
        String option;

        do {
            System.out.println("========================================");
            System.out.println("    Sistema de Matrícula Estudiantil    ");
            System.out.println("                 S.M.E                  ");
            System.out.println("========================================");
            System.out.println("        [1] Ingresar alumno             ");
            System.out.println("        [2] Mostrar alumnos             ");
            System.out.println("        [3] Eliminar registro           ");
            System.out.println("        [4] Modificar registro          ");
            System.out.println("        [5] Perfil institución          ");
            System.out.println("        [6] Salir                       ");
            System.out.println("========================================");
            System.out.print  ("            Ingrese su opción  :        ");
            option = lector.nextLine();

            switch (option){
                case "1":
                    break;

                case "2":
                    break;

                case "3":
                    break;

                case "4":
                    break;

                case "5":
                    break;

                case "6":
                    System.out.println("Hasta luego :)");

                default:
                    System.out.println("Ingrese una opción valida");
                        break;
            }
        } while ( !option.equals("6") );
    }
}

