package Ejercicios_tarea;

import java.util.Scanner;

public class TiendaConDescuentos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombrecliente;
        int tipocliente;
        double montocompra = 0.0;
        double totalfinal = 0.0;
        double descuentototal = 0.0;
        double porcentajebase = 0.0;
        final double DESCUENTO_COMPRA = 0.05;
        final double DESCUENTO_NORMAL = 0.0;
        final double DESCUENTO_FRECUENTE = 0.10;
        final double DESCUENTO_VIP = 0.20;
        System.out.println("Escribe tu nombre");
        nombrecliente = scanner.nextLine();
        System.out.println("Escribe el monto de tu compra");
        montocompra = scanner.nextDouble();
        System.out.println("Escribe el tipo de cliente: 1. Cliente Regular, 2. Cliente Frecuente, 3.Cliente VIP");
        tipocliente = scanner.nextInt();
        if (tipocliente == 1) {
            porcentajebase = DESCUENTO_NORMAL;
        } else if (tipocliente == 2) {
            porcentajebase = DESCUENTO_FRECUENTE;
        } else if (tipocliente == 3) {
            porcentajebase = DESCUENTO_VIP;
        }else {
            System.out.println("Tipo de cliente no valido");
        }
        descuentototal = montocompra*porcentajebase;
        if (montocompra > 2000){
            descuentototal = descuentototal + (montocompra*DESCUENTO_COMPRA);
        }
        totalfinal = montocompra-descuentototal;
        System.out.println("Cliente: "+nombrecliente);
        System.out.println("Monto original: "+ montocompra);
        System.out.println("Descuentos aplicados: "+ descuentototal);
        System.out.println("Total a pagar:" + totalfinal);
    }

}
