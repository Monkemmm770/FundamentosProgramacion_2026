package Ejercicios_tarea;

import java.util.Scanner;

public class CajeroComision {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final double LIMITE_RETIRO = 5000;
        final double COMISION = 10;
        double saldodisponible = 0;
        double cantidadaretirar = 0;
        System.out.println("Ingresa tu saldo disponible");
        saldodisponible = scanner.nextDouble();
        System.out.println("Ingresa la cantidad a retirar");
        cantidadaretirar = scanner.nextDouble();
        if (cantidadaretirar > 0 && cantidadaretirar <= LIMITE_RETIRO && (cantidadaretirar + COMISION) <= saldodisponible){
            double montoretirado = cantidadaretirar;
            double totalADescontar = cantidadaretirar + COMISION;
            double saldofinal = saldodisponible - totalADescontar;
            System.out.println("Retiro exitoso");
            System.out.println("Monto retirado: " + montoretirado);
            System.out.println("Comision: " + COMISION);
            System.out.println("Saldo final: " + saldofinal);
        }else{
            System.out.println("Retiro rechazado");
            System.out.println("La cantidad debe ser mayor a 0, no superar el limite de 5000 y tener saldo suficiente para cubrir el retiro y la comision de 10 pesos.");
        }
    }
}
