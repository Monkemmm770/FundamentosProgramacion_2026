package Ejercicios_tarea;

import java.util.Scanner;
public class cajero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double LIMITE_RETIRO = 5000;
        double saldodisponible = 0;
        double cantidadaretirar = 0;
        double efectivoentregado = 0;
        double saldorestante = 0;
        System.out.println("Introduce la cantidad de saldo disponible en la cuenta:");
        saldodisponible = scanner.nextDouble();
        System.out.println("Introduce la cantidad de saldo a retirar:");
        cantidadaretirar = scanner.nextDouble();
        if (cantidadaretirar > 0 && cantidadaretirar <= saldodisponible && cantidadaretirar <= LIMITE_RETIRO){

            efectivoentregado = cantidadaretirar;
            saldorestante = saldodisponible - cantidadaretirar;
            System.out.println("--RETIRO AUTORIZADO--");
            System.out.println("Efectivo entregado: " + efectivoentregado);
            System.out.println("Saldo restante: " + saldorestante);
            if (saldorestante < 500){
                System.out.println("SALDO RESTANTE BAJO!");
            }

        }else {
            System.out.println("Retiro Rechazado");
            System.out.println("La cantidad a retirar debe ser mayor a 0, " +
                    "no superar el limite de retiro (5000) y no exceder tu saldo disponible");
        }

    }


}
