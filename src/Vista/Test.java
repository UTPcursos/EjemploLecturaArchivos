package Vista;

import Controlador.AlumnoFileReader;
import Controlador.AlumnoPrint;
import Modelo.Alumno;

public class Test {
    public static void main(String[] args) {
        // Cargar alumnos desde el archivo y generar el reporte
        // de impresión en consola y archivo.
        // Se asume que el archivo "alumnos.txt" ya existe y contiene datos válidos.
        // Crear un objeto AlumnoFileReader para leer el archivo
        AlumnoFileReader alumnoFileReader = new AlumnoFileReader();
        // define el path del archivo de alumnos
        String filePath = "alumnos.txt";
        // Cargar el arreglo de alumnos desde el archivo
        Alumno[] arreglo=alumnoFileReader.loadAlumno(filePath);
        // crea un formato de impresión
        String formato=AlumnoPrint.formatoImpresion(arreglo);
        // imprime en consola
        AlumnoPrint.imprimirConsola(formato);
        // imprime en archivo
        AlumnoPrint.imprimirArchivo(formato, "Reportealumnos.txt");

    }
}
