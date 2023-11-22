package Taller6;
import java.util.Scanner;
public class ClasificaciónTriangulo2 {
    public static void main(String[] args) {
        double lado1;
        double lado2;
        double lado3;
        Scanner teclado = new Scanner(System.in);     
        System.out.println("Ingrese los 3 lados del triangulo: ");
        lado1 = teclado.nextInt();    
        lado2 = teclado.nextInt();    
        lado3 = teclado.nextInt();
        if (((lado1+lado2)>lado3)&&((lado1+lado3)>lado2)&&((lado2+lado3)>lado1))
            if ((lado1==lado2)&&(lado2==lado3)&&(lado3==lado1))
                System.out.println("Es un triángulo equilátero");
            else
                if ((lado1==lado2)||(lado2==lado3)||(lado3==lado1))
                    System.out.println("Es un triángulo isósceles");
                else
                    System.out.println("Es un triángulo escaleno");
        else
            System.out.println("No es un triangulo");
        }
    }    