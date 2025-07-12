package Vista;

import Controlador.AlumnoFileReader;
import Controlador.AlumnoPrint;
import Modelo.Alumno;

import java.util.Scanner;

public class Menu {

    private static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        // Ejecuta el menú de opciones
        ejecutarMenu();
    }


    public static void mostrarMenu() {
        System.out.println("=== Menú de Opciones ===");
        System.out.println("1. Cargar Alumnos desde Archivo");
        System.out.println("2. Imprimir Pantalla y Archivo");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void ejecutarMenu(){
        boolean salir = false;
        Alumno[] arreglo ;
        String formato="";

        while (!salir) {
            mostrarMenu();
            int opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    // Aquí se llamaría al método para cargar alumnos desde un archivo
                    System.out.println("Cargando alumnos desde archivo...");
                    AlumnoFileReader alumnoFileReader = new AlumnoFileReader();
                    String filePath = "alumnos.txt";
                    arreglo=alumnoFileReader.loadAlumno(filePath);
                    formato= AlumnoPrint.formatoImpresion(arreglo);
                    System.out.println("Alumnos cargados exitosamente desde " + filePath);

                    break;
                case 2:
                    // Aquí se llamaría al método para generar el reporte de alumnos
                    System.out.println("Generando reporte de alumnos...");
                    // imprime en consola
                    AlumnoPrint.imprimirConsola(formato);
                    // imprime en archivo
                    AlumnoPrint.imprimirArchivo(formato, "Reportealumnos.txt");
                    break;
                case 3:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
