package Taller6;
import java.util.Scanner;
public class FacturaProductos1 {
    public static void main(String[] args) {
        double producto1;
        double producto2;
        int Nproductos1;
        int Nproductos2;
        double Costo;
        double descuento;
        double Iva;
        double envio;
        Scanner teclado = new Scanner(System.in);     
        System.out.println("Numero de productos tipo 1: ");
        Nproductos1 = teclado.nextInt();
        System.out.println("Precio producto tipo 1: ");
        producto1 = teclado.nextDouble();
        System.out.println("Numero de productos tipo 2: ");
        Nproductos2 = teclado.nextInt();
        System.out.println("Precio producto tipo 2: ");
        producto2 = teclado.nextDouble();
        Costo=((Nproductos1*producto1)+(Nproductos2*producto2));
        Iva=((Costo*10)/100);
        System.out.println("Total: " + Costo);
        System.out.println("%Iva: " + Iva);
        Costo= Costo+Iva;
        System.out.println("Total más Iva: " + Costo);
        if (Costo>1000){
            descuento=((Costo*20)/100);
            Costo=Costo-descuento;
            System.out.println("Descuento: "+descuento);
            if (Costo>5000)
                System.out.println("Sin costo por envio");
            else{
                System.out.println("Ingresar precio por envio: ");
                envio = teclado.nextInt(); 
                Costo=(Costo+envio);}
        }else{
            System.out.println("Ingresar precio por envio: ");
            envio = teclado.nextInt();
            if(Costo==1000){
                descuento=((Costo*5)/100);
                Costo=Costo-descuento;
                System.out.println("Descuento: "+descuento);              
                Costo=Costo+envio;
            }else{
                System.out.println("descuento: ninguno");
                Costo=Costo+envio;
                }
            }
        System.out.println("Costo total: "+Costo);
        }
    }           