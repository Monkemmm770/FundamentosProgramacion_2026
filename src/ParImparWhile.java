import java.util.Scanner;

public class ParImparWhile {
    /*
    * Fundamentos de Programacion
    * Emir Perez Mendoza
    * 2026-14-10
    * Programa que evalua una serie de numeros si es par o impar
    * */
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        do {
            int n, contador = 1;
            System.out.println("Ingrese un numero");
            n = scanner.nextInt();
            while (contador <= n) {
                if (n % 2 == 0) { //n dividdo entre dos tiene residuo cero
                    System.out.println("El numero " + contador + " es par");
                } else {
                    System.out.println("El numero " + contador + " es impar");
                }
                contador++; //contador = contador + 1
            }
            System.out.println("Desea ingresar otro numero? 1) SI 2) NO");
            res = scanner.nextInt();

        } while (res == 1);
    }
}
