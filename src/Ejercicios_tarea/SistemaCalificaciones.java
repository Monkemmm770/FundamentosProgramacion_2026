package Ejercicios_tarea;

import java.util.Scanner;

public class SistemaCalificaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double MINIMO_APROBATORIO = 70.0;
        final double MINIMO_UNIDAD = 60.0;
        double calificacion1, calificacion2, calificacion3;
        double promedio;

        System.out.println("Escribe la primera calificacion:");
        calificacion1 = scanner.nextDouble();
        System.out.println("Escribe la segunda calificacion:");
        calificacion2 = scanner.nextDouble();
        System.out.println("Escribe la tercera calificacion:");
        calificacion3 = scanner.nextDouble();
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3.0;
        System.out.println("Unidad 1: " + calificacion1);
        System.out.println("Unidad 2: " + calificacion2);
        System.out.println("Unidad 3: " + calificacion3);
        System.out.println("Promedio: " + promedio);
        if (promedio >= MINIMO_APROBATORIO) {
            System.out.println("Aprobaste");
        } else {
            System.out.println("Reprobaste");
        }
        if (calificacion1 < MINIMO_UNIDAD) {
            System.out.println("Debe presentar recuperacion de la Unidad 1");
        }
        if (calificacion2 < MINIMO_UNIDAD) {
            System.out.println("Debe presentar recuperacion de la Unidad 2");
        }
        if (calificacion3 < MINIMO_UNIDAD) {
            System.out.println("Debe presentar recuperacion de la Unidad 3");
        }
    }
}