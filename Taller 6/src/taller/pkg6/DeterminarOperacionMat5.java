package Taller6;
import java.util.Scanner;
public class DeterminarOperacionMat5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso del paquete en kg: ");
        double pesoPaquete = scanner.nextDouble();

        System.out.print("Ingrese la región del paquete (local/nacional): ");
        String regionPaquete = scanner.next().toLowerCase();

        double costoEnvio = calcularCostoEnvio(regionPaquete, pesoPaquete);

        System.out.println("El costo de envío es: $" + costoEnvio);
    }

    public static double calcularCostoEnvio(String region, double peso) {
        double costo;

        if (peso < 5 && region.equals("local")) {
            costo = 5;
        } else if (peso >= 5 && peso <= 10 && region.equals("nacional")) {
            costo = 10;
        } else {
            costo = 15;
        }

        return costo;
    }
}