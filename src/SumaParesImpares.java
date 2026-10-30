import java.util.Scanner;

public class SumaParesImpares{

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        final int MINIMO = 1;
        int numero = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        int cantidadPares = 0;
        int cantidadImpares = 0;
        int otroCalculo = 0;
        do{
            sumaPares = 0;
            sumaImpares = 0;
            cantidadPares = 0;
            cantidadImpares = 0;
            System.out.println("Ingresa un numero entero positivo mayor que 0");
            numero = scanner.nextInt();
            while (numero < MINIMO){
                System.out.println("El numero no es valido, intenta nuevamente");
                numero = scanner.nextInt();
            }
            for (int i = 1; i <= numero; i++) {
                if (i % 2 == 0){
                    sumaPares += i;
                    cantidadPares++;
                }else {
                    sumaImpares += i;
                    cantidadImpares++;
                }
            }
            System.out.println("Suma de los numeros pares: " + sumaPares);
            System.out.println("Suma de los numeros impares: " + sumaImpares);
            System.out.println("Cantidad de numeros pares: " + cantidadPares);
            System.out.println("Cantidad de numeros impares: " + cantidadImpares);
            System.out.println("Deseas realizar otro calculo?\n1. Si\n2. No");
            otroCalculo = scanner.nextInt();
        }while (otroCalculo == 1);

    }
}