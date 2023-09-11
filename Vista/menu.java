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
            System.out.print  ("            Ingrese su opción  : ");
            opcion = lector.nextLine();
            System.out.println("========================================");

            switch (opcion){
                case "1":
                    Alumno nuevoAlumno = Main.agregarAlumno();
                    Main.agregarApoderado(nuevoAlumno);
                    CSV.agregarAlumnoCSV(nuevoAlumno);
                    break;



                case "2":
                    CSV.mostrarAlumnosCSV();

                    boolean continuarBusqueda = true;

                    do {
                        System.out.println("              =======================================");
                        System.out.println("              [1] Buscar detalles de alumno por RUT  ");
                        System.out.println("              [2] Salir                              ");
                        System.out.print  ("                    Ingrese una opción     : ");
                        String opcionBusqueda       = lector.nextLine();
                        System.out.println("              =======================================\n");

                        switch (opcionBusqueda) {
                            case "1":
                                System.out.println("                    ---------- BUSCAR ALUMNO POR RUT ---------- ");
                                System.out.print  ("                            Rut del alumno  : ");
                                String rutBusqueda  = lector.nextLine();
                                System.out.println(" ");
                                CSV.mostrarAlumnoPorRut(rutBusqueda);
                                break;

                            case "2":
                                // Termina la búsqueda y volver al menú principal
                                continuarBusqueda = false;
                                break;

                            default:
                                System.out.println("              Ingrese una opción válida...\n");
                        }
                    } while (continuarBusqueda);
                    break;



                case "3" :
                    CSV.mostrarAlumnosCSV();
                    System.out.println("\n              ---------- ELIMINAR ALUMNO ---------- ");
                    System.out.print("                      Rut del alumno a eliminar   : ");
                    String rutAEliminar = lector.next();
                    CSV.eliminarAlumnoCSV(rutAEliminar);
                    break;



                case "4":
                    CSV.mostrarAlumnosCSV();
                    System.out.println("\n              ---------- MODIFICAR ALUMNO POR RUT ---------- ");
                    System.out.print("                      Rut del alumno a modificar  : ");
                    String rutModificar = lector.nextLine();
                    System.out.println();
                    CSV.modificarAlumnoPorRut(rutModificar);
                    break;




                case "5":
                    Main.perfilInstitucion();
                    System.out.println("              ----------------------------------------------\n");
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

