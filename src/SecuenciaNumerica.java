import java.util.Scanner;

public class SecuenciaNumerica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int DIV_CUATRO = 4;
        final int DIV_TRES = 3;
        final int DIV_AMBOS = 12;
        int repetir;

        do {
            System.out.print("Ingresa un numero entero positivo N: ");
            int n = sc.nextInt();
            while (n <= 0) {
                System.out.print("Debe ser positivo. Ingresa N de nuevo: ");
                n = sc.nextInt();
            }

            int sumaDiv4 = 0;
            int multiplos3 = 0;
            int ambos = 0;
            int cuentaPares = 0;
            int sumaPares = 0;
            int cuentaImpares = 0;
            int sumaImpares = 0;
            int cuentaMult5 = 0;
            int sumaMult5 = 0;

            for (int i = 1; i <= n; i++) {
                if (i % DIV_AMBOS == 0) {
                    sumaDiv4 += i;
                    multiplos3++;
                    ambos++;
                } else if (i % DIV_CUATRO == 0) {
                    sumaDiv4 += i;
                } else if (i % DIV_TRES == 0) {
                    multiplos3++;
                }

                if (i % 2 == 0) {
                    cuentaPares++;
                    sumaPares += i;
                } else {
                    cuentaImpares++;
                    sumaImpares += i;
                }

                if (i % 5 == 0) {
                    cuentaMult5++;
                    sumaMult5 += i;
                }
            }

            System.out.println("Suma de los divisibles entre 4: " + sumaDiv4);
            System.out.println("Multiplos de 3: " + multiplos3);
            System.out.println("Divisibles entre ambos: " + ambos);

            System.out.println("Que estadisticas quieres ver?");
            System.out.println("1) Pares");
            System.out.println("2) Impares");
            System.out.println("3) Multiplos de 5");
            System.out.print("Opcion: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cantidad de pares: " + cuentaPares);
                    System.out.println("Suma de pares: " + sumaPares);
                    break;
                case 2:
                    System.out.println("Cantidad de impares: " + cuentaImpares);
                    System.out.println("Suma de impares: " + sumaImpares);
                    break;
                case 3:
                    System.out.println("Cantidad de multiplos de 5: " + cuentaMult5);
                    System.out.println("Suma de multiplos de 5: " + sumaMult5);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

            System.out.print("Quieres analizar otro numero? (1 = si, 0 = no): ");
            repetir = sc.nextInt();
        } while (repetir == 1);

        System.out.println("Programa terminado");
    }
}
