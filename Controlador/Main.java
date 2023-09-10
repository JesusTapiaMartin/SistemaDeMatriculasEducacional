package Controlador;


import java.util.Scanner;
import Clases.Alumno;

public class Main {

    //==================== MAIN ====================
    public static void main(String[] args) {

    }



    //==================== AGREGAR ALUMNO ====================
    public static void agregarAlumno(){
        Scanner lector = new Scanner(System.in);

        System.out.println(" ---------- AGREGAR ALUMNO ---------- ");
        System.out.println("        Nombre                  : ");
        String nombre = lector.nextLine();


        System.out.println("        Apellidos               : ");
        String apellido             = lector.nextLine();


        System.out.println("        Edad                    : ");
        String edad                 = lector.nextLine();


        System.out.println("        Rut                     : ");
        String rut                  = lector.nextLine();


        System.out.println("        Matrícula               : ");
        String matricula            = lector.nextLine();


        System.out.println("        Sexo                    : ");
        String sexo                 = lector.nextLine();


        System.out.println("        Dirección               : ");
        String direccion            = lector.nextLine();


        System.out.println("        Ciudad                  : ");
        String ciudad               = lector.nextLine();


        System.out.println("        Email                   : ");
        String email                = lector.nextLine();


        System.out.println("        Nacionaliad             : ");
        String nacionalidad         = lector.nextLine();


        System.out.println("        Vive con                : ");
        String viveCon              = lector.nextLine();


        System.out.println("        Gestionado por          : ");
        String gestionadoPor        = lector.nextLine();


        System.out.println("        Etnia                   : ");
        String etnia                = lector.nextLine();


        System.out.println("        Intitución de origen    : ");
        String insOrigen            = lector.nextLine();


        System.out.println("        Último curso            : ");
        String ultCurso             = lector.nextLine();


        System.out.println("        Repitente               : ");
        String repitente            = lector.nextLine();


        System.out.println("        Enfermedades            : ");
        String enfermedades         = lector.nextLine();


        System.out.println("        Medicamentos            : ");
        String medicamentos         = lector.nextLine();


        System.out.println("        Fecha de nacimiento     : ");
        String fechaDeNacimiento    = lector.nextLine();


        System.out.println("        Teléfono                : ");
        String telefono             = lector.nextLine();


        System.out.println("        Curso                   : ");
        String curso                = lector.nextLine();


        System.out.println("        Letra curso             : ");
        String letraCurso           = lector.nextLine();

        Alumno nuevoAlumno = new Alumno(nombre              , apellido          , edad              , rut                   ,
                                        matricula           , sexo              , direccion         , ciudad                ,
                                        email               , nacionalidad      , viveCon           , gestionadoPor         ,
                                        etnia               , insOrigen         , ultCurso          , repitente             ,
                                        enfermedades        , medicamentos      , fechaDeNacimiento , telefono              ,
                                        curso               , letraCurso);

    }
}
