import java.util.Scanner;

public class DivisonPorCeroV2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        String n = null;
        System.out.println("Dame el valor de a");
        a = scanner.nextInt();
        System.out.println("Dame el valor de b");
        b = scanner.nextInt();
        //dividir
        c = a/b;
        if (c != 0){
            System.out.println("c = " + c);
        }else{
            System.out.println("Estas dividiendo por 0");
        }
    }
}
