package Taller6;
import java.util.Scanner;
public class NumerodeMes4 {
    public static void main(String[] args) {
        int mes;
         
        Scanner teclado = new Scanner(System.in); //inicializar
        System.out.println("Ingrese un numero: ");
        mes = teclado.nextInt();
               
        System.out.println("----La solucion al problema----");
        
        switch (mes) {
            case 1 -> System.out.println("Enero");
            case 2 -> System.out.println("Febrero");
            case 3 -> System.out.println("Marzo");
            case 4 -> System.out.println("Abril");
            case 5 -> System.out.println("Mayo");
            case 6 -> System.out.println("Junio");
            case 7 -> System.out.println("Julio");
            case 8 -> System.out.println("Agosto");
            case 9 -> System.out.println("Septembre");
            case 10 -> System.out.println("Octubre");
            case 11 -> System.out.println("Noviembre");
            case 12 -> System.out.println("Diciembre");
        }         
            
            
        }
        
    }
