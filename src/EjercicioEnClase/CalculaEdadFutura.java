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
public class CalculaEdadFutura {
    public static void main(String[] args){
        int edad=0;
        String nombre="";//
        Scanner lector=new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        nombre=lector.nextLine();
        System.out.println("Ingresa tu edad");  
        edad=lector.nextInt();
        
        edad+=10;
        edad=edad+10;
        
        //System.out.println("Hola "+edad+" tu edad futura es "+nombre);
        
        System.out.printf("Hola %-10S tu edad es %d\n",nombre,edad);
    }
}
