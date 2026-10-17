import java.util.Scanner;
public class RegistroVehiculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcionPrincipal = 0;
        int opcionVehiculo = 0;
        int horas = 0;
        int TotalaPagar = 0;
        int TotalAutos = 0;
        int TotalCamionetas = 0;
        int TotalMotos = 0;
        int TotalRecaudado = 0;
        do {
            System.out.println("1. Registrar vehiculo");
            System.out.println("2. Consultar resumen");
            System.out.println("3. Salir");
            opcionPrincipal = sc.nextInt();
            switch (opcionPrincipal) {
                case 1:
                    do {
                        System.out.println("1. Automovil");
                        System.out.println("2. Camioneta");
                        System.out.println("3. Motocicleta");
                        System.out.println("4. Regresar al menu");
                        opcionVehiculo = sc.nextInt();
                        switch (opcionVehiculo) {
                            case 1:
                                System.out.println("Ingrese horas:");
                                horas = sc.nextInt();
                                TotalaPagar = horas * 20;
                                TotalAutos = TotalAutos + 1;
                                TotalRecaudado = TotalRecaudado + TotalaPagar;
                                System.out.println("Total a pagar: " + TotalaPagar);
                                break;
                            case 2:
                                System.out.println("Ingrese horas:");
                                horas = sc.nextInt();
                                TotalaPagar = horas * 30;
                                TotalCamionetas = TotalCamionetas + 1;
                                TotalRecaudado = TotalRecaudado + TotalaPagar;
                                System.out.println("Total a pagar: " + TotalaPagar);
                                break;
                            case 3:
                                System.out.println("Ingrese horas:");
                                horas = sc.nextInt();
                                TotalaPagar = horas * 10;
                                TotalMotos = TotalMotos + 1;
                                TotalRecaudado = TotalRecaudado + TotalaPagar;
                                System.out.println("Total a pagar: " + TotalaPagar);
                                break;
                        }
                    } while (opcionVehiculo != 4);
                    break;
                case 2:
                    int totalVehiculos = TotalAutos + TotalCamionetas + TotalMotos;
                    System.out.println("Vehiculos atendidos: " + totalVehiculos);
                    System.out.println("Automoviles: " + TotalAutos);
                    System.out.println("Camionetas: " + TotalCamionetas);
                    System.out.println("Motocicletas: " + TotalMotos);
                    System.out.println("Total recaudado: " + TotalRecaudado);
                    break;
            }
        } while (opcionPrincipal != 3);
    }
}
