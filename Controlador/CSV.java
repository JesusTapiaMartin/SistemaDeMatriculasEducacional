package Controlador;

import Clases.Alumno;
import Clases.Apoderado;
import java.io.*;
import java.util.Scanner;

public class CSV {

    // Atributos
    private static String nombreArchivo = " Matrículas.csv ";



    //==================== AGREGAR ALUMNO CSV ====================
    public static void agregarAlumnoCSV(Alumno nuevoAlumno){

        try{
            File archivo =new File(nombreArchivo);

            //  ---------- SI EL ARCHIVO NO EXISTE ----------
            if (!archivo.exists()){
                // Objeto BufferedWriter llamado "escritor", que se utiliza para escribir en el archivo.
                // Parámetro FileWriter para abrir el archivo en modo escritura.

                BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo));

                    // Encabezados del CSV
                escritor.write( " [ALUMNO] Nombres          , [ALUMNO] Apellidos                , [ALUMNO] Edad                     , [ALUMNO] Rut                      " +
                                " [ALUMNO] Matrícula        , [ALUMNO] Sexo                     , [ALUMNO] Dirección                , [ALUMNO] Ciudad                   " +
                                " [ALUMNO] Email            , [ALUMNO] Nacionalidad             , [ALUMNO] Vive con                 , [ALUMNO] Gestionado por           " +
                                " [ALUMNO] Etnia            , [ALUMNO] Institución de origen    , [ALUMNO] Último curso             , [ALUMNO] Repitente                " +
                                " [ALUMNO] Enfermedades     , [ALUMNO] Medicamentos             , [ALUMNO] Fecha de nacimiento      , [ALUMNO] Teléfono                 " +
                                " [ALUMNO] Curso            , [ALUMNO] Letra del curso          , [APODERADO] Nombres               , [APODERADO] Apellidos             " +
                                " [APODERADO] Rut           , [APODERADO] Parentesco            , [APODERADO] Teléfono              , [APODERADO] Email                 " +
                                " [APODERADO] Dirección     , [APODERADO] Villa                 , [APODERADO] Ciudad                , [APODERADO] Situación laboral     " +
                                " [APODERADO] Escolaridad   , [APODERADO] Observaciones         ");

                    // Una nueva línea después del encabezado
                escritor.newLine();

                    // Cerramos el escritor
                escritor.close();
            }


            //              ---------- ATRIBUTOS ----------
            // Alumno
            String nombresAlumno                = nuevoAlumno.getNombres();
            String apellidosAlumno              = nuevoAlumno.getApellidos();
            String edadAlumno                   = nuevoAlumno.getEdad();
            String rutAlumno                    = nuevoAlumno.getRut();
            String matriculaAlumno              = nuevoAlumno.getMatricula();
            String sexoAlumno                   = nuevoAlumno.getSexo();
            String direccionAlumno              = nuevoAlumno.getDireccion();
            String ciudadAlumno                 = nuevoAlumno.getCiudad();
            String emailAlumno                  = nuevoAlumno.getEmail();
            String nacionalidadAlumno           = nuevoAlumno.getNacionalidad();
            String viveConAlumno                = nuevoAlumno.getViveCon();
            String gestionadoPorAlumno          = nuevoAlumno.getGestionadoPor();
            String etniaAlumno                  = nuevoAlumno.getEtnia();
            String insOrigenAlumno              = nuevoAlumno.getInsOrigen();
            String ultCursoAlumno               = nuevoAlumno.getUltCurso();
            String repitenteAlumno              = nuevoAlumno.getRepitente();
            String enfermedadesAlumno           = nuevoAlumno.getEnfermedades();
            String medicamentosAlumno           = nuevoAlumno.getMedicamentos();
            String fechaDeNacimientoAlumno      = nuevoAlumno.getFechaDeNacimiento();
            String telefonoAlumno               = nuevoAlumno.getTelefono();
            String cursoAlumno                  = nuevoAlumno.getCurso();
            String letraCursoAlumno             = nuevoAlumno.getLetraCurso();


            // Apoderado
            Apoderado apoderado = nuevoAlumno.getNuevoApoderado();
            String nombresApoderado             = apoderado.getNombres();
            String apellidosApoderado           = apoderado.getApellidos();
            String rutApoderado                 = apoderado.getRut();
            String parentescoApoderado          = apoderado.getParentesco();
            String telefonoApoderado            = apoderado.getTelefono();
            String emailApoderado               = apoderado.getEmail();
            String direccionApoderado           = apoderado.getDireccion();
            String ciudadApoderado              = apoderado.getCiudad();
            String situacionLaboralApoderado    = apoderado.getSituacionLaboral();
            String escolaridadApoderado         = apoderado.getEscolaridad();
            String observacionesApoderado       = apoderado.getObservaciones();


            //              ---------- AGREGAR ----------}
                // Para agregar datos al final del archivo existente en modo append (sin sobrescribir el archivo)
            BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo, true));

                // Para escribir los datos del alumno y su apoderado
            escritor.write( nombresAlumno           + "," + apellidosAlumno             + "," + rutAlumno                   + "," + matriculaAlumno             + "," +
                            sexoAlumno              + "," + direccionAlumno             + "," + ciudadAlumno                + "," + emailAlumno                 + "," +
                            nacionalidadAlumno      + "," + viveConAlumno               + "," + gestionadoPorAlumno         + "," + etniaAlumno                 + "," +
                            insOrigenAlumno         + "," + ultCursoAlumno              + "," + repitenteAlumno             + "," + enfermedadesAlumno          + "," +
                            medicamentosAlumno      + "," + fechaDeNacimientoAlumno     + "," + telefonoAlumno              + "," + edadAlumno                  + "," +
                            cursoAlumno             + "," + letraCursoAlumno            + "," + nombresApoderado            + "," + apellidosApoderado          + "," +
                            rutApoderado            + "," + parentescoApoderado         + "," + telefonoApoderado           + "," + emailApoderado              + "," +
                            direccionApoderado      + "," + ciudadApoderado             + "," + situacionLaboralApoderado   + "," + escolaridadApoderado        + "," +
                            observacionesApoderado      );


                // Para agregar una nueva línea, cada vez que agregemos un alumno
            escritor.newLine();

            escritor.close();

            System.out.println("    El alumno y su apoderado registrados correctamente en \' Matrículas.csv\' ");


        } catch(IOException e){
            System.out.println("    Error al registrar " + e.getMessage());

        }
    }





    //==================== MOSTRAR ALUMNOS CSV ====================
    public static void mostrarAlumnosCSV(){
        try{
            BufferedReader lector   = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            System.out.println              ("              --------- ALUMNOS ---------- ");

            boolean primeraLinea    = true;

            while((linea = lector.readLine()) != null){
                // Para detectar y omitir la primera línea del archivo que contiene los encabezados
                if(primeraLinea){
                    primeraLinea = false;
                    continue;
                }

                // Sedivide la línea actual en campos utilizando una coma como separador
                String[] campos = linea.split(",");

                if (campos.length >= 32){
                    String rutAlumno            = campos[2].trim();
                    String nombresAlumno        = campos[0].trim();
                    String apellidosAlumno      = campos[1].trim();
                    String nombresApoderado     = campos[23].trim();
                    String apellidosApoderado   = campos[24].trim();
                    String cursoAlumno          = campos[21].trim();
                    String letraCursoAlumno     = campos[22].trim();

                    System.out.println      ("                  Rut alumno : " + rutAlumno);
                    System.out.println      ("                  Alumno     : " + nombresAlumno     + " " + apellidosAlumno     );
                    System.out.println      ("                  Apoderado  : " + nombresApoderado  + " " + apellidosApoderado  );
                    System.out.println      ("                  Curso      : " + cursoAlumno       + " " + letraCursoAlumno    );
                    System.out.println      ("              ----------------------------");
                }
            }

            lector.close();

        } catch(IOException e){
            System.err.println("    Hubo un error al leer el archivo   : " + e.getMessage());

        }
    }





    //==================== MOSTRAR ALUMNOS POR RUT ====================
    public static void mostrarAlumnoPorRut(String rutBusqueda) {
        try {
            BufferedReader lector       = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            boolean encontrado          = false;

            while ((linea               = lector.readLine()) != null) {
                String[] campos         = linea.split(",");

                if (campos.length       >= 32) {
                    String rutAlumno    = campos[2].trim();

                    // Elimina puntos y guiones del RUT para hacer la comparación
                    rutAlumno           = rutAlumno.replaceAll("[.-]", "");

                    // Compara los RUT sin considerar mayúsculas ni minúsculas
                    if (rutAlumno.equalsIgnoreCase(rutBusqueda)) {
                        encontrado      = true;


                        String nombresAlumno                = campos[0].trim();
                        String apellidosAlumno              = campos[1].trim();
                        String edadAlumno                   = campos[3].trim();
                        String matriculaAlumno              = campos[4].trim();
                        String sexoAlumno                   = campos[5].trim();
                        String direccionAlumno              = campos[6].trim();
                        String ciudadAlumno                 = campos[7].trim();
                        String emailAlumno                  = campos[8].trim();
                        String nacionalidadAlumno           = campos[9].trim();
                        String viveConAlumno                = campos[10].trim();
                        String gestionadoPorAlumno          = campos[11].trim();
                        String etniaAlumno                  = campos[12].trim();
                        String insOrigenAlumno              = campos[13].trim();
                        String ultCursoAlumno               = campos[14].trim();
                        String repitenteAlumno              = campos[15].trim();
                        String enfermedadesAlumno           = campos[16].trim();
                        String medicamentosAlumno           = campos[17].trim();
                        String fechaDeNacimientoAlumno      = campos[18].trim();
                        String telefonoAlumno               = campos[19].trim();
                        String cursoAlumno                  = campos[20].trim();
                        String letraCursoAlumno             = campos[21].trim();
                        String nombresApoderado             = campos[22].trim();
                        String apellidosApoderado           = campos[23].trim();
                        String rutApoderado                 = campos[24].trim();
                        String parentescoApoderado          = campos[25].trim();
                        String telefonoApoderado            = campos[26].trim();
                        String emailApoderado               = campos[27].trim();
                        String direccionApoderado           = campos[28].trim();
                        String ciudadApoderado              = campos[29].trim();
                        String situacionLaboralApoderado    = campos[30].trim();
                        String escolaridadApoderado         = campos[31].trim();
                        String observacionesApoderado       = campos[32].trim();


                        System.out.println("                  Rut alumno                        : " + rutAlumno                                     );
                        System.out.println("                  Alumno                            : " + nombresAlumno     + " " + apellidosAlumno     );
                        System.out.println("                  Edad                              : " + edadAlumno                                    );
                        System.out.println("                  Matrícula                         : " + matriculaAlumno                               );
                        System.out.println("                  Sexo                              : " + sexoAlumno                                    );
                        System.out.println("                  Dirección                         : " + direccionAlumno                               );
                        System.out.println("                  Ciudad                            : " + ciudadAlumno                                  );
                        System.out.println("                  Email                             : " + emailAlumno                                   );
                        System.out.println("                  Nacionalidad                      : " + nacionalidadAlumno                            );
                        System.out.println("                  Vive con                          : " + viveConAlumno                                 );
                        System.out.println("                  Gestionado por                    : " + gestionadoPorAlumno                           );
                        System.out.println("                  Etnia                             : " + etniaAlumno                                   );
                        System.out.println("                  Institución de origen             : " + insOrigenAlumno                               );
                        System.out.println("                  Último curso                      : " + ultCursoAlumno                                );
                        System.out.println("                  Repitente                         : " + repitenteAlumno                               );
                        System.out.println("                  Enfermedades                      : " + enfermedadesAlumno                            );
                        System.out.println("                  Medicamentos                      : " + medicamentosAlumno                            );
                        System.out.println("                  Fecha de nacimiento               : " + fechaDeNacimientoAlumno                       );
                        System.out.println("                  Teléfono                          : " + telefonoAlumno                                );
                        System.out.println("                  Curso                             : " + cursoAlumno       + " " + letraCursoAlumno    );
                        System.out.println("                  Nombres apoderado                 : " + nombresApoderado                              );
                        System.out.println("                  Apellidos apoderado               : " + apellidosApoderado                            );
                        System.out.println("                  Rut apoderado                     : " + rutApoderado                                  );
                        System.out.println("                  Parentesco apoderado              : " + parentescoApoderado                           );
                        System.out.println("                  Teléfono apoderado                : " + telefonoApoderado                             );
                        System.out.println("                  Email apoderado                   : " + emailApoderado                                );
                        System.out.println("                  Dirección apoderado               : " + direccionApoderado                            );
                        System.out.println("                  Ciudad apoderado                  : " + ciudadApoderado                               );
                        System.out.println("                  Situación laboral apoderado       : " + situacionLaboralApoderado                     );
                        System.out.println("                  Escolaridad apoderado             : " + escolaridadApoderado                          );
                        System.out.println("                  Observaciones apoderado           : " + observacionesApoderado                        );
                        System.out.println("              ----------------------------");

                        // Salimos del bucle una vez que se encuentra el estudiante
                        break;
                    }
                }
            }

            lector.close();

            if (!encontrado) {
                System.out.println("        No se encontró el rut ");
            }

        } catch (IOException e) {
            System.err.println("        Error al leer el archivo : " + e.getMessage());
        }
    }






    //==================== ELIMINAR ALUMNO CSV ====================
    public static void eliminarAlumnoCSV(String rutEstudiante){
        try{
            File archivo                = new File(nombreArchivo);
            Scanner lector              = new Scanner(archivo);
            BufferedWriter escritor     = new BufferedWriter(new FileWriter(nombreArchivo + ".temp"));

            while (lector.hasNextLine()){
                String linea = lector.nextLine();

                if(!linea.contains("," + rutEstudiante + ",")){
                    escritor.write(linea);
                    escritor.newLine();

                }
            }

            lector.close();
            escritor.close();

            archivo.delete();

            File archivoTemp = new File(nombreArchivo+ ".temp");
            archivoTemp.renameTo(archivo);

            System.out.println("    El estudiante de rut " + rutEstudiante + " fue eliminado correctamente ");

        } catch(IOException e){
            System.err.println("    Hubo un error al eliminar el estudiante    : " + e.getMessage());
        }

    }





    //==================== MODIFICAR ALUMNO POR RUT ====================
    public static void modificarAlumnoPorRut(String rutBusqueda) {
        try {
            File archivo                = new File(nombreArchivo);
            BufferedReader lector       = new BufferedReader(new FileReader(archivo));
            BufferedWriter escritor     = new BufferedWriter(new FileWriter(nombreArchivo + ".temp"));

            String linea;

            boolean encontrado          = false;

            while ((linea               = lector.readLine()) != null) {
                String[] campos         = linea.split(",");

                if (campos.length      >= 24) {
                    String rutAlumno    = campos[3].trim();

                    // Elimina puntos y guiones del RUT para hacer la comparación
                    rutAlumno           = rutAlumno.replaceAll("[.-]", "");

                    if (rutAlumno.equals(rutBusqueda)) {
                        encontrado      = true;

                        Scanner scanner = new Scanner(System.in);
                        System.out.println("              ---------- DATOS ACTUALES ---------- ");
                        System.out.println("                  Nombre                            : " + campos[0].trim());
                        System.out.println("                  Apellidos                         : " + campos[1].trim());
                        System.out.println("                  Edad                              : " + campos[2].trim());
                        System.out.println("                  Matrícula                         : " + campos[4].trim());
                        System.out.println("                  Sexo                              : " + campos[5].trim());
                        System.out.println("                  Dirección                         : " + campos[6].trim());
                        System.out.println("                  Ciudad                            : " + campos[7].trim());
                        System.out.println("                  Email                             : " + campos[8].trim());
                        System.out.println("                  Nacionalidad                      : " + campos[9].trim());
                        System.out.println("                  Vive con                          : " + campos[10].trim());
                        System.out.println("                  Gestionado por                    : " + campos[11].trim());
                        System.out.println("                  Etnia                             : " + campos[12].trim());
                        System.out.println("                  Institución de origen             : " + campos[13].trim());
                        System.out.println("                  Último curso                      : " + campos[14].trim());
                        System.out.println("                  Repitente                         : " + campos[15].trim());
                        System.out.println("                  Enfermedades                      : " + campos[16].trim());
                        System.out.println("                  Medicamentos                      : " + campos[17].trim());
                        System.out.println("                  Fecha de nacimiento               : " + campos[18].trim());
                        System.out.println("                  Teléfono                          : " + campos[19].trim());
                        System.out.println("                  Curso                             : " + campos[20].trim());
                        System.out.println("                  Letra del curso                   : " + campos[21].trim());
                        System.out.println("                  Nombres apoderado                 : " + campos[22].trim());
                        System.out.println("                  Apellidos apoderado               : " + campos[23].trim());
                        System.out.println("                  RUT apoderado                     : " + campos[24].trim());
                        System.out.println("                  Parentesco apoderado              : " + campos[25].trim());
                        System.out.println("                  Teléfono apoderado                : " + campos[26].trim());
                        System.out.println("                  Email apoderado                   : " + campos[27].trim());
                        System.out.println("                  Dirección apoderado               : " + campos[28].trim());
                        System.out.println("                  Ciudad apoderado                  : " + campos[29].trim());
                        System.out.println("                  Situación laboral apoderado       : " + campos[30].trim());
                        System.out.println("                  Escolaridad apoderado             : " + campos[31].trim());
                        System.out.println("                  Observaciones apoderado           : " + campos[32].trim());


                        System.out.println("\n              ---------- MODIFICAR ALUMNO ---------- ");

                        System.out.print("                    [Nuevo] Nombre                    : ");
                        String nuevoNombre = scanner.nextLine();

                        System.out.print("                    [Nuevo] Apellidos                 : ");
                        String nuevosApellidos = scanner.nextLine();


                        System.out.print("                    [Nuevo] Edad                      : ");
                        String nuevaEdad = scanner.nextLine();


                        System.out.print("                    [Nuevo] Rut                       : ");
                        String nuevoRutAlumno = scanner.nextLine();


                        System.out.print("                    [Nuevo] Matrícula                 : ");
                        String nuevaMatricula = scanner.nextLine();


                        System.out.print("                    [Nuevo] Sexo                      : ");
                        String nuevoSexo = scanner.nextLine();


                        System.out.print("                    [Nuevo] Dirección                 : ");
                        String nuevaDireccion = scanner.nextLine();


                        System.out.print("                    [Nuevo] Ciudad                    : ");
                        String nuevaCiudad = scanner.nextLine();


                        System.out.print("                    [Nuevo] Email                     : ");
                        String nuevoEmail = scanner.nextLine();


                        System.out.print("                    [Nuevo] Nacionalidad              : ");
                        String nuevaNacionalidad = scanner.nextLine();


                        System.out.print("                    [Nuevo] Vive con                  : ");
                        String nuevoViveCon = scanner.nextLine();


                        System.out.print("                    [Nuevo] Gestionado por            : ");
                        String nuevoGestionadoPor = scanner.nextLine();


                        System.out.print("                    [Nuevo] Etnia                     : ");
                        String nuevaEtnia = scanner.nextLine();


                        System.out.print("                    [Nuevo] Institución de origen     : ");
                        String nuevaInsOrigen = scanner.nextLine();


                        System.out.print("                    [Nuevo] Último curso              : ");
                        String nuevoUltCurso = scanner.nextLine();


                        System.out.print("                    [Nuevo] Repitente                 : ");
                        String nuevoRepitente = scanner.nextLine();


                        System.out.print("                    [Nuevo] Enfermedades              : ");
                        String nuevasEnfermedades = scanner.nextLine();


                        System.out.print("                    [Nuevo] Medicamentos              : ");
                        String nuevosMedicamentos = scanner.nextLine();


                        System.out.print("                    [Nuevo] Fecha de nacimiento       : ");
                        String nuevaFechaNacimiento = scanner.nextLine();


                        System.out.print("                    [Nuevo] Teléfono                  : ");
                        String nuevoTelefono = scanner.nextLine();


                        System.out.print("                    [Nuevo] Curso                     : ");
                        String nuevoCurso = scanner.nextLine();


                        System.out.print("                    [Nuevo] Letra del curso           : ");
                        String nuevaLetraCurso = scanner.nextLine();


                        System.out.println("              ---------- AGREGAR APODERADO ---------- ");


                        System.out.print("                    [Nuevo] Nombres                   : ");
                        String nuevosNombresApoderado = scanner.nextLine();


                        System.out.print("                    [Nuevo] Apellidos                 : ");
                        String nuevosApellidosApoderado = scanner.nextLine();


                        System.out.print("                    [Nuevo] RUT                       : ");
                        String nuevoRutApoderado = scanner.nextLine();


                        System.out.print("                    [Nuevo] Parentesco                : ");
                        String nuevoParentescoApoderado = scanner.nextLine();


                        System.out.print("                    [Nuevo] Teléfono                  : ");
                        String nuevoTelefonoApoderado = scanner.nextLine();


                        System.out.print("                    [Nuevo] Email                     : ");
                        String nuevoEmailApoderado = scanner.nextLine();


                        System.out.print("                    [Nuevo] Dirección                 : ");
                        String nuevaDireccionApoderado = scanner.nextLine();


                        System.out.print("                    [Nuevo] Ciudad                    : ");
                        String nuevaCiudadApoderado = scanner.nextLine();


                        System.out.print("                    [Nuevo] Situación laboral         : ");
                        String nuevaSituacionLaboralApoderado = scanner.nextLine();


                        System.out.print("                    [Nuevo] Escolaridad               : ");
                        String nuevaEscolaridadApoderado = scanner.nextLine();


                        System.out.print("                    [Nuevo] Observaciones             : ");
                        String nuevasObservacionesApoderado = scanner.nextLine();

                        // Solicitar y actualizar otros datos...

                        // Escribir los datos modificados en el archivo temporal
                        escritor.write( nuevoNombre                     + "," + nuevosApellidos                 + "," + nuevaEdad                       + "," + nuevoRutAlumno              + "," +
                                        nuevaMatricula                  + "," + nuevoSexo                       + "," + nuevaDireccion                  + "," + nuevaCiudad                 + "," +
                                        nuevoEmail                      + "," + nuevaNacionalidad               + "," + nuevoViveCon                    + "," + nuevoGestionadoPor          + "," +
                                        nuevaEtnia                      + "," + nuevaInsOrigen                  + "," + nuevoUltCurso                   + "," + nuevoRepitente              + "," +
                                        nuevasEnfermedades              + "," + nuevosMedicamentos              + "," + nuevaFechaNacimiento            + "," + nuevoTelefono               + "," +
                                        nuevoCurso                      + "," + nuevaLetraCurso                 + "," + nuevosNombresApoderado          + "," + nuevosApellidosApoderado    + "," +
                                        nuevoRutApoderado               + "," + nuevoParentescoApoderado        + "," + nuevoTelefonoApoderado          + "," + nuevoEmailApoderado         + "," +
                                        nuevaDireccionApoderado         + "," + nuevaCiudadApoderado            + "," + nuevaSituacionLaboralApoderado  + "," + nuevaEscolaridadApoderado   + "," +
                                        nuevasObservacionesApoderado);



                        System.out.println("        Alumno modificado correctamente... ");
                    } else {
                        // Si no es el estudiante buscado, simplemente copia la línea tal como está al archivo temporal
                        escritor.write(linea);

                    }
                    escritor.newLine();
                }
            }

            lector.close();
            escritor.close();

            archivo.delete();

            File archivoTemp = new File(nombreArchivo + ".temp");
            archivoTemp.renameTo(archivo);

            if (!encontrado) {
                System.out.println("No se encontró ningún estudiante con el RUT proporcionado.");
            }

        } catch (IOException e) {
            System.err.println("Hubo un error al leer/actualizar el archivo: " + e.getMessage());
        }
    }
}
