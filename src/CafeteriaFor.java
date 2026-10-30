import java.util.Scanner;

public class CafeteriaFor {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int cantidadClientes = 0;
        int calificacion = 0;
        int acumuladorCalificaciones = 0;
        int clientesSatisfechos = 0;
        int clientesInsatisfechos = 0;
        int calificacionMasAlta = 0;
        double promedio = 0;
        String evaluacionServicio = "";
        do{
        System.out.println("Ingresa el numero de encuestados");
        cantidadClientes = scanner.nextInt();
        if (cantidadClientes < 1){
            System.out.println("Debe haber un encuestado, intenta nuevamente");
        }
        }while (cantidadClientes < 1);
        for (int i = 1; i <= cantidadClientes; i++){
            System.out.println("Cliente numero " + i + "\nIngresa la calificacion de satisfaccion (1-10)");
            calificacion = scanner.nextInt();
            while (calificacion < 1 || calificacion > 10){
                System.out.println("La calificacion no es valida, intenta nuevamente");
                System.out.println("Ingresa la calificacion de satisfaccion (1-10)");
                calificacion = scanner.nextInt();
            }
            if (calificacion >= 7){
                clientesSatisfechos++;
            }else {
                clientesInsatisfechos++;
            }
            if (calificacion > calificacionMasAlta){
                calificacionMasAlta = calificacion;
            }
            acumuladorCalificaciones += calificacion;
            System.out.println("Tu calificacion : " + calificacion + "\nHa sido registrada :)");

        }
        promedio = (double) acumuladorCalificaciones /cantidadClientes;
        if (promedio >= 8){
            evaluacionServicio = ("Excelente servicio");
        } else if (promedio >= 6) {
            evaluacionServicio = ("Servicio aceptable");
        } else  {
            evaluacionServicio = ("Se requiere mejorar el servicio");
        }
        System.out.println("===============");
        System.out.println("Reporte final");
        System.out.println("Cantidad de clientes encuestados: " + cantidadClientes);
        System.out.println("Suma de las calificaciones: " + acumuladorCalificaciones);
        System.out.println("Promedio: " + promedio);
        System.out.println("Clientes satisfechos: " + clientesSatisfechos);
        System.out.println("Clientes insatisfechos: " + clientesInsatisfechos);
        System.out.println("Calificacion mas alta: " + calificacionMasAlta);
        System.out.println("Evaluacion final de servicio: " + evaluacionServicio);

    }
}