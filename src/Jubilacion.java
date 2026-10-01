import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Jubilacion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int EDAD_JUBILACION = 65;
        String Nombre;
        int Edad = 0;
        System.out.println("Escribe tu nombre");
        Nombre = sc.nextLine();
        System.out.println("Escribe tu edad");
        Edad = sc.nextInt();

        if (Edad >= EDAD_JUBILACION) {   //Si edad es <= 65 entonces...

            System.out.println(Nombre + " Tiene " + Edad + " Años Y esta listo para jubilarse");
        } //FinSi
        else { //SiNo
            System.out.println(Nombre + " Tiene " + Edad + " Años Y aun no esta tan viejo xd");
            System.out.println("Le faltan " + (EDAD_JUBILACION-Edad) + " Años para jubilarse");
        }

    }
}
