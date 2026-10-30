package Ejercicios;

import java.util.Scanner;

public class MenuOperaciones {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcionPrincipal = 0, numOperacion = 0, operacion = 0, suma = 0;
        do {
            System.out.println("---Menu de operaciones---");
            System.out.println("1.) Calcular cuadrado de un numero");
            System.out.println("2.) Calcular cubo de un numero");
            System.out.println("3.) Determinar si un numero es par o impar");
            System.out.println("4.) Calcular suma de numeros desde 1 hasta un numero ingresado");
            System.out.println("5.) Salir del programa");
            opcionPrincipal = scanner.nextInt();
            switch (opcionPrincipal){
                case 1:
                    System.out.println("Ingresa el numero que quieres calcular:");
                    numOperacion = scanner.nextInt();
                    if (numOperacion <= 0){
                        System.out.println("Numero no valido");
                    } else{
                    operacion = numOperacion * numOperacion;
                    System.out.println("Resultado: " + operacion);
                    } break;
                case 2:
                    System.out.println("Ingresa el numero que quieres calcular:");
                    numOperacion = scanner.nextInt();
                    if (numOperacion <= 0){
                        System.out.println("Numero no valido");
                    } else{
                    operacion = numOperacion * numOperacion * numOperacion;
                    System.out.println("Resultado: " + operacion);
                    } break;
                case 3:
                    System.out.println("Ingresa el numero que quieres determinar:");
                    numOperacion = scanner.nextInt();
                    if (numOperacion <= 0){
                        System.out.println("Numero no valido");
                    } else{
                    if (numOperacion% 2 == 0) {
                        System.out.println("El número " + numOperacion + " es par");
                    } else {
                        System.out.println("El número " + numOperacion + " es impar");
                    }
                    } break;
                case 4:
                    System.out.println("Ingresa el numero a calcular:");
                    numOperacion = scanner.nextInt();
                    if (numOperacion <= 0){
                        System.out.println("Numero no valido");
                    } else {
                        suma = 0;
                        for (int i = 1; i <= numOperacion; i++){
                            suma = suma + i;
                        }
                        System.out.println("Resultado: " + suma);
                    } break;
                case 5:
                    System.out.println("---Saliendo del programa---");
                    break;
                default:
                    System.out.println("Opcion no valida, intenta nuevamente");
            }
        }while(opcionPrincipal != 5);
    }
}
