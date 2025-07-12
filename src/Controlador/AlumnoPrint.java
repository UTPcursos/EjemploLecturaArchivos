package Controlador;

import Modelo.Alumno;

public class AlumnoPrint {

    public static String formatoImpresion(Alumno[] alumnos) {
        // Crea un StringBuilder para construir la salida formateada
        StringBuilder sb = new StringBuilder();
        // Agrega el encabezado de la tabla

        sb.append(String.format("%-40s %6s %5s %30s %13s %30s %5s\n",
                "Nombre", "Edad", "Sexo", "Correo", "Celular", "Carrera", "Ciclo"));
        // Agrega una línea de separación
        sb.append("=".repeat(140)).append("\n");
        // Recorre el arreglo de alumnos y agrega cada uno a la salida
         // Utiliza un bucle for-each para recorrer el arreglo de alumnos
         // Utiliza el método toString() de la clase Alumno para formatear la salida
        for (Alumno alumno : alumnos) {
            sb.append(alumno.toString()).append("\n");
        }
        // Agrega una línea de separación al final
         // Utiliza el método repeat() para crear una línea de separación
        sb.append("=".repeat(140)).append("\n");

        // Retorna la salida formateada como una cadena
        // Utiliza el método toString() del StringBuilder para obtener la cadena final
        return sb.toString();
    }

    public static void imprimirConsola(String formato){
        // Imprime el formato en la consola
        System.out.println(formato);
    }

    public static void imprimirArchivo(String formato, String path) {
        // utiliza metodo AlumnoFileReader para escribir el formato en un archivo
        AlumnoFileReader.writeFile("ReporteAlumno.txt", formato);
    }

}
