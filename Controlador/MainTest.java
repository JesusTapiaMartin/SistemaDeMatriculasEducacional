package Controlador;

import static org.junit.jupiter.api.Assertions.*;

import Clases.Alumno;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MainTest {

    @Test
    void testAgregarAlumnoCSV() {
        Alumno nuevoAlumno = new Alumno(
                "Juan"      , "Pérez"               , "18"          , "12345678-9"  , "2023001"         , "Masculino"       , "Calle 123"   ,
                "Ciudad A"  , "juan@example.com"    , "Chileno"     , "Padres"      , "Etnia X"         , "Colegio A"       ,
                "8"         , "No"                  , "Ninguna"     , "Ninguno"     , "01/01/2005"      , "+56912345678"    ,
                "Primero"   , "A"                   , "A"
        );

        CSV.agregarAlumnoCSV(nuevoAlumno);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CSV.mostrarAlumnosCSV();

        assertTrue(outContent.toString().contains("     El alumno y su apoderado registrados correctamente "));
    }

    @Test
    void testMostrarAlumnosCSV() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.mostrarAlumnosCSV();
        String expectedOutput = "Rut alumno : 12345678-9";
        assertTrue(outContent.toString().contains(expectedOutput));
    }

    @Test
    void testMostrarAlumnoPorRut() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String rutBusqueda      = "12345678-9";
        Main.mostrarAlumnoPorRut(rutBusqueda);
        String expectedOutput   = "Rut alumno                        : 12345678-9";
        assertTrue(outContent.toString().contains(expectedOutput));
    }

    @Test
    void testEliminarAlumnoCSV() {
        String rutAEliminar     = "12345678-9";
        Main.eliminarAlumnoCSV(rutAEliminar);
        // Verificar que el estudiante se haya eliminado correctamente del archivo
    }

    @Test
    void testModificarAlumnoPorRut() {
        String rutAModificar    = "12345678-9";
        Main.modificarAlumnoPorRut(rutAModificar);
        // Verificar que los datos del estudiante se hayan modificado correctamente en el archivo
    }


}
