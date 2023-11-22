package Taller6;
import java.util.Scanner;
public class CostoEnvioPaquete3 {
    public static void main(String[] args) {
        double peso;
        Scanner teclado = new Scanner(System.in);     
        System.out.println("Ingrese el peso del paquete: ");
        peso = teclado.nextDouble();    
        System.out.print("Ingrese la región del paquete (local/nacional): ");
        String regionPaquete = teclado.next();
        if (peso < 5 && regionPaquete.equals("local"))
            System.out.println("El costo del envio es de: 5$");
        else if ((5<=peso)&&(peso<10)&&(regionPaquete.equals("nacional")))
            System.out.println("El costo de envio es de: 10$");
        else
            System.out.println("El costo de envio es de: 15$");                        
    }
}