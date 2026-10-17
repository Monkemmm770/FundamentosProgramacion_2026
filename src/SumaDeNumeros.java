import java.util.Scanner;

public class SumaDeNumeros {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int acumulador = 0;
        int x = 0;
        int respuesta = 0;
        do {
            System.out.println("Ingrese un numero para sumar");
            x = scanner.nextInt();
            acumulador = acumulador + x;
            System.out.println("Desea ingresar otro numero? \n 1) SI \n NO");
        }
        while (respuesta == 1);
        System.out.println("Respuesta =");
    }
}
