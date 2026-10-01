    import java.util.Scanner;

    public class ClasificarCalificacion {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Ingresa una calificación ");

            int calificacion = sc.nextInt();

            if (calificacion >= 90 && calificacion <= 100) {

                System.out.println("Excelente");

            }
            else if (calificacion >= 80 && calificacion <= 89) {

                System.out.println("Muy bien");
            }

            else if (calificacion >= 70 && calificacion <= 79) {

                System.out.println("Bien");

            }
            else if (calificacion >= 60 && calificacion <= 69) {

                System.out.println("Suficiente");
            }
            else if (calificacion >= 0 && calificacion <= 59) {

                System.out.println("Reprobaste");
            }

        }


    }


