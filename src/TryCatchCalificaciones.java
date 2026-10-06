import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchCalificaciones {
    static void main() {
try {
            Scanner scanner = new Scanner(System.in);
            double calificacion1;
            double calificacion2;
            double calificacion3;
            double promedio;
            System.out.println("Ingresa la primera calificacion");
            calificacion1 = scanner.nextDouble();
            System.out.println("Ingresa la segunda calificacion");
            calificacion2 = scanner.nextDouble();
            System.out.println("Ingresa la tercera calificacion");
            calificacion3 = scanner.nextDouble();
            promedio = (calificacion1+calificacion2+calificacion3)/3;
            System.out.println("El promedio del alumno es: " + promedio);
    }catch (InputMismatchException me){
        System.out.println("Ingresaste un valor no valido");
    }
}}