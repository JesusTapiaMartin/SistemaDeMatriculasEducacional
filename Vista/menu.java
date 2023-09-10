package Vista;
import java.util.Scanner;
import Clases.Alumno;
import Controlador.Main;
import Controlador.CSV;

public class menu {
    public static void interfazSME () {
        Scanner lector = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("========================================");
            System.out.println("    Sistema de Matrícula Estudiantil    ");
            System.out.println("               La Granja                ");
            System.out.println("========================================");
            System.out.println("        [1] Ingresar alumno             ");
            System.out.println("        [2] Mostrar alumnos             ");
            System.out.println("        [3] Eliminar registro           ");
            System.out.println("        [4] Modificar registro          ");
            System.out.println("        [5] Perfil institución          ");
            System.out.println("        [6] Salir                       ");
            System.out.println("========================================");
            System.out.print  ("            Ingrese su opción  :        ");
            opcion = lector.nextLine();
            System.out.println("========================================");

            switch (opcion){
                case "1":
                    Alumno nuevoAlumno = Main.agregarAlumno();
                    Main.agregarApoderado(nuevoAlumno);
                    CSV.agregarAlumnoCSV(nuevoAlumno);
                    break;


                case "2":
                    break;

                case "3":
                    break;

                case "4":
                    break;

                case "5":
                    System.out.println("                    ---------- PERFIL INSTITUCIÓN ----------");
                    Main.perfilInstitucion();
                    break;


                case "6":
                    System.out.println("        Hasta luego... ");

                default:
                    System.out.println("        Ingrese una opción válida... ");
                        break;
            }
        } while ( !opcion.equals("6") );
    }
}

