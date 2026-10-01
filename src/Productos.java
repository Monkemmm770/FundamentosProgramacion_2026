import java.util.Scanner;
public class Productos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double DESC_1000 = 0.10;
        final double COSTOFIJO = 80;
        double precioproducto;
        int unidadproducto;
        double subtotal;
        double descuento=0;
        double totaldescuento=0;
        double envio=0;
        double totalfinal=0;
        System.out.println("Escribe el precio del producto");
        precioproducto = scanner.nextDouble();
        System.out.println("Escribe cuantas unidades");
        unidadproducto = scanner.nextInt();
        subtotal = precioproducto*unidadproducto;
        if (subtotal >=1000){
            descuento = subtotal *DESC_1000;
            totaldescuento = subtotal - descuento;
            if (totaldescuento <=1500){
                envio = COSTOFIJO;
                totalfinal = totaldescuento + COSTOFIJO;
            } else {
                envio =0;
                totalfinal = totaldescuento;
            }
        } else {
            totalfinal = subtotal;
        }
        System.out.println("Precio del producto: " + precioproducto);
        System.out.println("Cantidad: " + unidadproducto);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total con Descuento: " + totaldescuento);
        System.out.println("Envio: " + envio);
        System.out.println("Total Final: " + totalfinal);



    }
}
