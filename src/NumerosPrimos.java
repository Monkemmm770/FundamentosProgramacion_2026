import java.util.Scanner;

public class NumerosPrimos {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int sumaPares = 0;
        int divisiblesEntreTres = 0;
        int cantidadPrimos = 0;
        int sumaPrimos = 0;
        int divisores = 0;
        double promedioPrimos = 0;
        do{
            System.out.println("Ingresa un numero entero positivo");
            numero = scanner.nextInt();
            if (numero < 1){
                System.out.println("El numero debe ser mayor que cero, intenta nuevamente");
            }
        }while (numero < 1);
        System.out.println("Numeros primos encontrados:");
        for (int i = 1; i <= numero; i++) {
            divisores = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0){
                    divisores++;
                }
            }
            if (divisores == 2){
                System.out.print(i + " ");
                cantidadPrimos++;
                sumaPrimos += i;
            }
            if (i % 2 == 0){
                sumaPares += i;
            }
            if (i % 3 == 0){
                divisiblesEntreTres++;
            }
        }
        System.out.println();
        if (cantidadPrimos > 0){
            promedioPrimos = (double) sumaPrimos / cantidadPrimos;
        }
        System.out.println("Numero ingresado: " + numero);
        System.out.println("Cantidad de numeros primos: " + cantidadPrimos);
        System.out.println("Suma de los numeros pares: " + sumaPares);
        System.out.println("Numeros divisibles entre 3: " + divisiblesEntreTres);
        System.out.println("Promedio de los numeros primos: " + promedioPrimos);
    }
}