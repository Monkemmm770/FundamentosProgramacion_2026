import java.util.Scanner;

public class DivisionPorCero {
    static void main() {
        try {

        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        String n = null;
        System.out.println("Dame el valor de a");
        a = scanner.nextInt();
        System.out.println("Dame el valor de b");
        b = scanner.nextInt();
        //dividir
        c = a/b;
        System.out.println("c = " + c);
        }catch (ArithmeticException ae){
            System.out.println("No puedes dividir por cero");
        }catch (NullPointerException np){
            System.out.println("Estas manejando mal un null");
        }finally {
            System.out.println("Me voy a ejecutar siempre");
        }
        
    }
}
