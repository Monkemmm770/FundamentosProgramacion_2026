import java.util.Scanner;

public class AprobadoOReprobado {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        String Nombre;
        double Calificacion;
        System.out.println("Escribe tu nombre");
        Nombre = sc.nextLine();
        System.out.println("Escribe tu calificacion total");
        Calificacion = sc.nextDouble();

        if(Calificacion >= 70 ) {
            System.out.println(Nombre + ", Has aprobado la materia ");
        }
        else {
            System.out.println(Nombre + ", Has reprobado la materia ");
        }
    }
}
