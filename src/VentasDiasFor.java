import java.util.Scanner;

public class VentasDiasFor {
    public static void main (String[] args){
        int numeroDias, ventaDia, acumuladorVentas = 0, contadorDiasBuenos = 0, respuesta = 0;
        Scanner scanner = new Scanner(System.in);
        do {

        System.out.println("Ingrese el numero de dias");
        numeroDias = scanner.nextInt();
        for (int i = 1; i <= numeroDias; i++) {
            System.out.println("Ingresa la venta del dia " + i);
            ventaDia = scanner.nextInt();
            acumuladorVentas += ventaDia; //acumuladorVentas = acumuladorVentas + ventaDia
            if (ventaDia >= 1000){
                contadorDiasBuenos++;
            }
            if (ventaDia >= 5000 ){
                break;
            }
        }
        System.out.println("acumulador Ventas = " + acumuladorVentas);
        System.out.println("Dias buenos = " + contadorDiasBuenos);
        System.out.println("Desea repetir la operacion  \n 1) SI \n 2) NO");
        respuesta = scanner.nextInt();

    }while(respuesta == 1);
}
}
