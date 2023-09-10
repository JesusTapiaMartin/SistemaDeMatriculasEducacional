package Controlador;

import Clases.Alumno;
import Clases.Apoderado;
import java.io.*;

public class CSV {

    // Atributos
    private static String nombreArchivo = " Matrículas.csv ";



    //==================== AGREGAR ALUMNO CSV ====================
    public static void agregarAlumnoCSV(Alumno nuevoAlumno){

        try{
            File archivo =new File(nombreArchivo);

            //  ---------- SI EL ARCHIVO NO EXISTE ----------
            if (!archivo.exists()){
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
                // Para agregar datos al final del archivo, en vez de sobreescribirlo
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

            System.out.println("  El alumno y su apoderado registrados correctamente en \' Matrículas.csv\' ");


        } catch(IOException e){
            System.out.println(" Error al registrar " + e.getMessage());

        }
    }
}
