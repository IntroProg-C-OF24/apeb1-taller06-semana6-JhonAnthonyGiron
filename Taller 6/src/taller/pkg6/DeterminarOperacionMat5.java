package Taller6;
import java.util.Scanner;
public class DeterminarOperacionMat5 {
    public static void main(String[] args) {
        int operacion;
         
        Scanner teclado = new Scanner(System.in); //inicializar
        System.out.println("Ingrese un numero: ");
        operacion = teclado.nextInt();
               
        System.out.println("----La solucion al problema----");
        
        switch (operacion) {
            case 1 -> System.out.println("Suma");
            case 2 -> System.out.println("Resta");
            case 3 -> System.out.println("Multiplicación");
            case 4 -> System.out.println("División");
        }                            
      }      
    }