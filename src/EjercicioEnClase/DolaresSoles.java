/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioEnClase;
import java.util.Scanner;
/**
 *
 * @author c23421
 */
public class DolaresSoles {
    public static void main(String[] args) {
       final double TIPO_CAMBIO=3.97;
       double importeDolares,importeSoles;
       
       Scanner lector=new Scanner(System.in);
       
       System.out.println("Ingresa el importe Dolares");
       importeDolares=lector.nextDouble();
       
       importeSoles=importeDolares*TIPO_CAMBIO;
       
        System.out.println("El importe en soles es "+importeSoles);
        System.out.printf("El importe en soles es %-10.2f \n",importeSoles);
    }
}
