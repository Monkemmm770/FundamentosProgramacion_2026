import java.util.Scanner;

public class Gasolinera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int TotalCargas = 0;
        double AcumuladoLitros = 0;
        double ImporteSinDescuentoTotal = 0;
        double TotalCobrado = 0;
        int CargasConDescuento = 0;
        double ImporteTotal = 0;
        double PromedioImporte = 0;
        int opcion = 0;
        do {
            System.out.println("Menu: 1. Registrar carga, 2. Ver resumen del dia, 4. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los litros cargados:");
                    double litros = scanner.nextDouble();
                    System.out.println("Ingrese el precio por litro:");
                    double precio = scanner.nextDouble();
                    double descuento = 0;
                    if (litros > 0 && precio > 0) {
                        double importe = litros * precio;
                        if (litros >= 40) {
                            descuento = importe * 0.05;
                            CargasConDescuento++;
                        }
                        ImporteTotal = importe - descuento;
                        ImporteSinDescuentoTotal = ImporteSinDescuentoTotal + importe;
                        AcumuladoLitros = AcumuladoLitros + litros;
                        TotalCobrado = TotalCobrado + ImporteTotal;
                        TotalCargas++;
                        System.out.println("Seleccione el metodo de pago: 1. Efectivo, 2. Tarjeta, 3. Transferencia");
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
                        System.out.println("Importe de la carga: " + ImporteTotal);
                    } else {
                        System.out.println("Error: Los litros y el precio deben ser mayores a cero");
                    }
                    break;
                case 2:
                    if (TotalCargas > 0) {
                        PromedioImporte = TotalCobrado / TotalCargas;
                    }
                    System.out.println("Total de litros vendidos: " + AcumuladoLitros);
                    System.out.println("Numero de cargas registradas: " + TotalCargas);
                    System.out.println("Cargas con descuento: " + CargasConDescuento);
                    System.out.println("Importe total antes de descuentos: " + ImporteSinDescuentoTotal);
                    System.out.println("Total cobrado: " + TotalCobrado);
                    System.out.println("Importe promedio por carga: " + PromedioImporte);
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