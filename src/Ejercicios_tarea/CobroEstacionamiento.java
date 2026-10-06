package Ejercicios_tarea;

import java.util.Scanner;

public class CobroEstacionamiento {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final double TARIFA_MOTO = 10;
        final double TARIFA_AUTO = 20;
        final double TARIFA_CAMIONETA = 30;
        final double DESCUENTO_5_HORAS = 0.10;
        final double DESCUENTO_10_HORAS = 0.20;
        int tipoVehiculo = 0;
        double horas = 0;
        double tarifaPorHora = 0;
        double subtotal = 0;
        double porcentajeDescuento = 0;
        double descuento = 0;
        double totalAPagar = 0;
        String nombreVehiculo = "";
        System.out.println("Ingresa el tipo de vehiculo: 1. Motocicleta, 2. Automovil, 3. Camioneta");
        tipoVehiculo = scanner.nextInt();
        System.out.println("Ingresa el numero de horas estacionado:");
        horas = scanner.nextDouble();
        if (horas <= 0){
            System.out.println("La cantidad de horas no es valida");
        }else{
            if (tipoVehiculo == 1){
                tarifaPorHora = TARIFA_MOTO;
                nombreVehiculo = "Motocicleta";
            }else if (tipoVehiculo == 2){
                tarifaPorHora = TARIFA_AUTO;
                nombreVehiculo = "Automovil";
            }else if (tipoVehiculo == 3){
                tarifaPorHora = TARIFA_CAMIONETA;
                nombreVehiculo = "Camioneta";
            }else{
                System.out.println("Tipo de vehiculo no valido");
            }
            if (tarifaPorHora > 0){
                subtotal = horas * tarifaPorHora;
                if (horas > 10){
                    porcentajeDescuento = DESCUENTO_10_HORAS;
                }else if (horas > 5){
                    porcentajeDescuento = DESCUENTO_5_HORAS;
                }
                descuento = subtotal * porcentajeDescuento;
                totalAPagar = subtotal - descuento;
                System.out.println("Tipo de vehiculo: " + nombreVehiculo);
                System.out.println("Horas: " + horas);
                System.out.println("Tarifa por hora: " + tarifaPorHora);
                System.out.println("Subtotal: " + subtotal);
                System.out.println("Descuento: " + descuento);
                System.out.println("Total a pagar: " + totalAPagar);
            }
        }
    }
}