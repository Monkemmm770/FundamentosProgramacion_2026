import java.util.Scanner;

public class CentroMedico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Niños = 0;
        int Adolescentes = 0;
        int Adultos = 0;
        int AdultosMayores = 0;
        double DineroRecaudado = 0;
        double DescuentosAplicados = 0;
        double SumaPagos = 0;
        int TotalPacientes = 0;
        double TotalPagar = 0;
        double Promedio = 0;
        int opcion = 0;
        do {
            System.out.println("Menu: 1. Registrar paciente, 2. Ver resumen del dia, 4. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la edad del paciente:");
                    int edad = scanner.nextInt();
                    System.out.println("Ingrese el costo de la consulta:");
                    double costo = scanner.nextDouble();
                    double descuento = 0;
                    if (edad < 12) {
                        Niños++;
                    } else {
                        if (edad >= 12 && edad <= 17) {
                            Adolescentes++;
                        } else {
                            if (edad >= 18 && edad <= 59) {
                                Adultos++;
                            } else {
                                AdultosMayores++;
                                descuento = costo * 0.15;
                            }
                        }
                    }
                    TotalPagar = costo - descuento;
                    DineroRecaudado = DineroRecaudado + TotalPagar;
                    DescuentosAplicados = DescuentosAplicados + descuento;
                    SumaPagos = SumaPagos + TotalPagar;
                    TotalPacientes++;
                    System.out.println("Seleccione su metodo de pago: 1. Efectivo, 2. Tarjeta, 3. Transferencia");
                    int MetodoDePago = scanner.nextInt();
                    switch (MetodoDePago) {
                        case 1:
                            System.out.println("Pago en efectivo registrado");
                            break;
                        case 2:
                            System.out.println("Pago con tarjeta registrado");
                            break;
                        case 3:
                            System.out.println("Pago por transferencia registrado");
                            break;
                        default:
                            System.out.println("Ese metodo no es valido");
                            break;
                    }
                    break;
                case 2:
                    if (TotalPacientes > 0) {
                        Promedio = SumaPagos / TotalPacientes;
                    }
                    System.out.println("Total de niños: " + Niños);
                    System.out.println("Total de adolescentes: " + Adolescentes);
                    System.out.println("Total de adultos: " + Adultos);
                    System.out.println("Total de adultos mayores: " + AdultosMayores);
                    System.out.println("Dinero recaudado: " + DineroRecaudado);
                    System.out.println("Descuentos aplicados: " + DescuentosAplicados);
                    System.out.println("Promedio pagado por paciente: " + Promedio);
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 4);
    }
}