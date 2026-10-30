import java.util.Scanner;

public class CompetenciaResistencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int RONDAS = 5;
        final double LIMITE_BAJO = 2;
        final double LIMITE_ALTO = 4;
        int repetir;

        do {
            System.out.print("Cantidad de participantes: ");
            int participantes = sc.nextInt();
            while (participantes <= 0) {
                System.out.print("Debe ser mayor a cero. Ingresa la cantidad de nuevo: ");
                participantes = sc.nextInt();
            }

            double distanciaGeneral = 0;
            double mayorDistancia = 0;
            int ganador = 0;
            int rondasBajo = 0;
            int rondasMedio = 0;
            int rondasAlto = 0;

            for (int p = 1; p <= participantes; p++) {
                double totalParticipante = 0;
                System.out.println("Participante " + p);

                for (int r = 1; r <= RONDAS; r++) {
                    System.out.print("Distancia en km de la ronda " + r + ": ");
                    double distancia = sc.nextDouble();
                    while (distancia < 0) {
                        System.out.print("Debe ser mayor o igual a cero. Ingresa la distancia de nuevo: ");
                        distancia = sc.nextDouble();
                    }

                    totalParticipante += distancia;

                    if (distancia < LIMITE_BAJO) {
                        rondasBajo++;
                    } else if (distancia <= LIMITE_ALTO) {
                        rondasMedio++;
                    } else {
                        rondasAlto++;
                    }
                }

                double promedio = totalParticipante / RONDAS;
                System.out.println("Distancia total del participante " + p + ": " + totalParticipante);
                System.out.println("Promedio del participante " + p + ": " + promedio);

                distanciaGeneral += totalParticipante;

                if (totalParticipante > mayorDistancia) {
                    mayorDistancia = totalParticipante;
                    ganador = p;
                }
            }

            System.out.println("Que estadistica general quieres ver?");
            System.out.println("1) Distancia total de la competencia");
            System.out.println("2) Promedio por participante");
            System.out.println("3) Rondas por categoria");
            System.out.println("4) Participante con mayor distancia");
            System.out.print("Opcion: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Distancia total: " + distanciaGeneral);
                    break;
                case 2:
                    System.out.println("Promedio por participante: " + distanciaGeneral / participantes);
                    break;
                case 3:
                    System.out.println("Rondas bajo: " + rondasBajo);
                    System.out.println("Rondas medio: " + rondasMedio);
                    System.out.println("Rondas alto: " + rondasAlto);
                    break;
                case 4:
                    System.out.println("Participante " + ganador + " con " + mayorDistancia + " km");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

            System.out.print("Quieres registrar otra competencia? (1 = si, 0 = no): ");
            repetir = sc.nextInt();
        } while (repetir == 1);

        System.out.println("Programa terminado");
    }
}
