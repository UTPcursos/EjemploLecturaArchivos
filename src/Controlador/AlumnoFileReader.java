package Controlador;

import Modelo.Alumno;

import java.io.*;
import java.util.Arrays;

public class AlumnoFileReader {

    public static Alumno[] loadAlumno(String path){
        // Crea un objeto File con la ruta proporcionada
        File file = new File(path);
        // Verifica si el archivo existe
        if (!file.exists()) {
            System.out.println("El archivo no existe: " + path);
            return new Alumno[0];
        }

        // Empieza la lectura del archivo
        // utiliza un FileReader para leer el archivo
        // Utiliza BufferedReader para leer el archivo línea por línea
        // los pone dentro del try block para manejar excepciones
        // hace que al momento de fallar se cierre el BufferedReader automáticamente
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            // una variable para almacenar cada línea leída
            String line;
            // Crea un arreglo de Alumno con una capacidad inicial
            Alumno[] alumnos = new Alumno[100]; // una capacidad inicial muy grande segun el archivo aca no hay de otra
            // un índice para llevar la cuenta de cuántos alumnos se han leído
            int index = 0;

            // Lee cada línea del archivo
            while ((line = br.readLine()) != null) {
                // Divide la línea en partes usando la coma como separador
                String[] parts = line.split(",");
                // Verifica que la línea tenga el número correcto de partes
                if (parts.length == 7) {
                    // Separa los valores y crea un nuevo objeto Alumno
                    String nombre = parts[0].trim();
                    int edad = Integer.parseInt(parts[1].trim());
                    String sexo = parts[2].trim();
                    String correo = parts[3].trim();
                    String celular = parts[4].trim();
                    String carrera = parts[5].trim();
                    String ciclo = parts[6].trim();

                    // Agrega el nuevo Alumno al arreglo
                    alumnos[index++] = new Alumno(nombre, edad, sexo, correo, celular, carrera, ciclo);
                }
            }
            // retorna un arreglo de Alumno con solo los elementos leídos, sin espacios vacíos
            return Arrays.copyOf(alumnos, index); // Retorna solo los elementos leídos
        } catch (IOException e) {
            // Maneja cualquier error de lectura del archivo
            System.out.println("Error al leer el archivo: " + e.getMessage());
            // Retorna un arreglo vacío en caso de error
            return new Alumno[0];
        }
    }

    // Metodo para escribir un archivo con el formato dado
    public static void writeFile(String path, String formato) {
        // Crea un objeto File con la ruta proporcionada
        File file = new File(path);
        // escribe el contenido en el archivo
        // utiliza un BufferedWriter para escribir en el archivo
        // utiliza el FileWriter para abrir el archivo en modo de escritura
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, false))) {
            // Escribe el contenido formateado en el archivo
            bw.write(formato);
        } catch (IOException e) {
            // Maneja cualquier error de escritura del archivo
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }


}
