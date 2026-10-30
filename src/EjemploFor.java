import java.util.Scanner;

public class EjemploFor {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int interacciones;
        System.out.println("Ingrea el numero de interacciones");
        interacciones = scanner.nextInt();
        for(int i = 1; i <= interacciones; i++){ //inicio del for
            System.out.println(i);
        }
        //fin del for
        System.out.println("Continua operacion");
    }
}
