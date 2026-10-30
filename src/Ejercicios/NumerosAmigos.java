package Ejercicios;

import java.util.Scanner;

public class NumerosAmigos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repetir;

        do {
            System.out.print("Ingresa el primer numero entero positivo: ");
            int num1 = sc.nextInt();
            while (num1 <= 0) {
                System.out.print("Debe ser positivo. Ingresa el primer numero de nuevo: ");
                num1 = sc.nextInt();
            }

            System.out.print("Ingresa el segundo numero entero positivo: ");
            int num2 = sc.nextInt();
            while (num2 <= 0) {
                System.out.print("Debe ser positivo. Ingresa el segundo numero de nuevo: ");
                num2 = sc.nextInt();
            }

            int suma1 = 0;
            int cuenta1 = 0;
            for (int i = 1; i < num1; i++) {
                if (num1 % i == 0) {
                    suma1 += i;
                    cuenta1++;
                }
            }

            int suma2 = 0;
            int cuenta2 = 0;
            for (int i = 1; i < num2; i++) {
                if (num2 % i == 0) {
                    suma2 += i;
                    cuenta2++;
                }
            }

            System.out.println("Que quieres mostrar?");
            System.out.println("1) Suma de los divisores de cada numero");
            System.out.println("2) Solo el resultado de la comparacion");
            System.out.print("Opcion: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Divisores propios de " + num1 + ": " + cuenta1 + ", suma: " + suma1);
                    System.out.println("Divisores propios de " + num2 + ": " + cuenta2 + ", suma: " + suma2);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

            if (suma1 == num2 && suma2 == num1) {
                System.out.println(num1 + " y " + num2 + " son numeros amigos");
            } else {
                System.out.println(num1 + " y " + num2 + " no son numeros amigos");
            }

            System.out.print("Quieres analizar otra pareja? (1 = si, 0 = no): ");
            repetir = sc.nextInt();
        } while (repetir == 1);

        System.out.println("Programa terminado");
    }
}