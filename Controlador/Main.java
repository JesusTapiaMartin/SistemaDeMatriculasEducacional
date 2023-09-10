package Controlador;


import java.util.Scanner;
import Clases.Alumno;
import Clases.Apoderado;
import Vista.Menu;


public class Main {

    //==================== MAIN ====================
    public static void main(String[] args) {
        Menu.interfazSME();
    }



    //==================== AGREGAR ALUMNO ====================
    public static Alumno agregarAlumno(){
        Scanner lector = new Scanner(System.in);

        System.out.println("        ---------- AGREGAR ALUMNO ---------- ");
        System.out.print  ("                Nombre                  : ");
        String nombre = lector.nextLine();


        System.out.print  ("                Apellidos               : ");
        String apellido             = lector.nextLine();


        System.out.print  ("                Edad                    : ");
        String edad                 = lector.nextLine();


        System.out.print  ("                Rut                     : ");
        String rut                  = lector.nextLine();


        System.out.print  ("                Matrícula               : ");
        String matricula            = lector.nextLine();


        System.out.print  ("                Sexo                    : ");
        String sexo                 = lector.nextLine();


        System.out.print  ("                Dirección               : ");
        String direccion            = lector.nextLine();


        System.out.print  ("                Ciudad                  : ");
        String ciudad               = lector.nextLine();


        System.out.print  ("                Email                   : ");
        String email                = lector.nextLine();


        System.out.print  ("                Nacionaliad             : ");
        String nacionalidad         = lector.nextLine();


        System.out.print  ("                Vive con                : ");
        String viveCon              = lector.nextLine();


        System.out.print  ("                Gestionado por          : ");
        String gestionadoPor        = lector.nextLine();


        System.out.print  ("                Etnia                   : ");
        String etnia                = lector.nextLine();


        System.out.print  ("                Intitución de origen    : ");
        String insOrigen            = lector.nextLine();


        System.out.print  ("                Último curso            : ");
        String ultCurso             = lector.nextLine();


        System.out.print  ("                Repitente               : ");
        String repitente            = lector.nextLine();


        System.out.print  ("                Enfermedades            : ");
        String enfermedades         = lector.nextLine();


        System.out.print  ("                Medicamentos            : ");
        String medicamentos         = lector.nextLine();


        System.out.print  ("                Fecha de nacimiento     : ");
        String fechaDeNacimiento    = lector.nextLine();


        System.out.print  ("                Teléfono                : ");
        String telefono             = lector.nextLine();


        System.out.print  ("                Curso                   : ");
        String curso                = lector.nextLine();


        System.out.print  ("                Letra curso             : ");
        String letraCurso           = lector.nextLine();

            // Creamos un objeto de la clase "Alumno" con los valores que ingresa el usuario
        Alumno nuevoAlumno = new Alumno(    nombre              , apellido          , edad              , rut                   ,
                                            matricula           , sexo              , direccion         , ciudad                ,
                                            email               , nacionalidad      , viveCon           , gestionadoPor         ,
                                            etnia               , insOrigen         , ultCurso          , repitente             ,
                                            enfermedades        , medicamentos      , fechaDeNacimiento , telefono              ,
                                            curso               , letraCurso);

        return nuevoAlumno;
    }

    //==================== AGREGAR APODERADO ====================
        // Le pasamos como parámetro el último alumno creado
    public static void agregarApoderado(Alumno nuevoAlumno){
        Scanner lector = new Scanner(System.in);
        System.out.println("        ---------- AGREGAR APODERADO ---------- ");
        System.out.print  ("                Nombres                 : ");
        String nombres              = lector.nextLine();


        System.out.print  ("                Apedillos               : ");
        String apellidos            = lector.nextLine();


        System.out.print  ("                Rut                     : ");
        String rut                  = lector.nextLine();


        System.out.print  ("                Parentesco              : ");
        String parentesco           = lector.nextLine();


        System.out.print  ("                Telefono                : ");
        String telefono             = lector.nextLine();


        System.out.print  ("                Email                   : ");
        String email                = lector.nextLine();


        System.out.print  ("                Dirección               : ");
        String direccion            = lector.nextLine();


        System.out.print  ("                Ciudad                  : ");
        String ciudad               = lector.nextLine();


        System.out.print  ("                Situación laboral       : ");
        String situacionLaboral     = lector.nextLine();


        System.out.print  ("                Escolaridad             : ");
        String escolaridad          = lector.nextLine();


        System.out.print  ("                Observaciones           : ");
        String observaciones        = lector.nextLine();

        Apoderado nuevoApoderado = new Apoderado(   nombres                     , apellidos                 , rut                           ,
                                                    parentesco                  , telefono                  , email                         ,
                                                    direccion                   , ciudad                    , situacionLaboral              ,
                                                    escolaridad                 , observaciones);

            // Al alumno que acabamos de crear le asignamos un apoderado
            // Esto con un "setNuevoApoderado" usando como parámetro el atributo "nuevoApoderado" de la clase Alumno
        nuevoAlumno.setNuevoApoderado(nuevoApoderado);

    }

    public static void perfilInstitucion() {
        System.out.println(" ---------- Perfil de la Institucion ---------- ");
        System.out.println("        Nombre          : Complejo Educacional La Granja de Cajón   ");
        System.out.println("        Dirección       : ARTURO PRAT Nº 0181                       ");
        System.out.println("        Director        : Luis Toro Chávez                          ");
        System.out.println("        RBD             : 05613-8                                   ");
        System.out.println("        Año escolar     : 2023                                      ");
        System.out.println("        Teléfono        : 45-2371050                                ");
    }
}
