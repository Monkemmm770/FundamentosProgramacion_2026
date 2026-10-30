package Ejercicios;

import java.util.Scanner;

public class AhorroMensual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double INTERES = 0.01;
        int repetir;

        do {
            System.out.print("Cantidad inicial de dinero: ");
            double inicial = sc.nextDouble();
            while (inicial <= 0) {
                System.out.print("Debe ser positiva. Ingresa la cantidad inicial de nuevo: ");
                inicial = sc.nextDouble();
            }

            System.out.print("Meta de ahorro: ");
            double meta = sc.nextDouble();
            while (meta <= 0) {
                System.out.print("Debe ser positiva. Ingresa la meta de nuevo: ");
                meta = sc.nextDouble();
            }

            System.out.print("Ahorro mensual fijo: ");
            double mensual = sc.nextDouble();
            while (mensual <= 0) {
                System.out.print("Debe ser positivo. Ingresa el ahorro mensual de nuevo: ");
                mensual = sc.nextDouble();
            }

            System.out.println("Plazo de simulacion:");
            System.out.println("1) 6 meses");
            System.out.println("2) 12 meses");
            System.out.println("3) 24 meses");
            System.out.print("Opcion: ");
            int opcion = sc.nextInt();

            int meses;
            switch (opcion) {
                case 1:
                    meses = 6;
                    break;
                case 2:
                    meses = 12;
                    break;
                case 3:
                    meses = 24;
                    break;
                default:
                    meses = 12;
                    System.out.println("Opcion no valida, se usaran 12 meses");
            }

            double saldo = inicial;
            double interesesTotales = 0;
            int mesesMeta = 0;

            for (int mes = 1; mes <= meses; mes++) {
                saldo += mensual;
                double interes = saldo * INTERES;
                saldo += interes;
                interesesTotales += interes;

                if (saldo >= meta && mesesMeta == 0) {
                    mesesMeta = mes;
                }
            }

            System.out.println("Saldo final: " + saldo);
            System.out.println("Intereses generados: " + interesesTotales);

            if (mesesMeta > 0) {
                System.out.println("Meta alcanzada en " + mesesMeta + " meses");
            } else {
                System.out.println("La meta no se alcanzo en " + meses + " meses");
            }

            System.out.print("Quieres hacer otra simulacion? (1 = si, 0 = no): ");
            repetir = sc.nextInt();
        } while (repetir == 1);

        System.out.println("Programa terminado");
    }
}
