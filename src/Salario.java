import java.util.Scanner;

public class Salario {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int horastrabajadas;
        int pagoporhora;
        int pagototal;
        int horasextra;
        System.out.println("Escribe el nombre del empleado");
        nombre = scanner.nextLine();
        System.out.println("Escribe las horas trabajadas");
        horastrabajadas = scanner.nextInt();
        System.out.println("Escribe el pago por hora");
        pagoporhora = scanner.nextInt();
        if (horastrabajadas<=40){
            horasextra = 0;
            pagototal = horastrabajadas*pagoporhora;
            System.out.println("Nombre: " + nombre +
                    "\nHoras trabajadas: " + horastrabajadas +
                    "\nPago por hora: " + pagoporhora +
                    "\nHoras normales: " + horastrabajadas +
                    "\nHoras extra: 0" +
                    "\nSalario total: " + pagototal);
        } if (horastrabajadas>40){
            horasextra = horastrabajadas-40;
            pagototal = (40 * pagoporhora) + (horasextra * pagoporhora * 2);
            System.out.println("Nombre: " + nombre +
                    "\nHoras trabajadas: " + horastrabajadas +
                    "\nPago por hora: " + pagoporhora +
                    "\nHoras normales: " + (horastrabajadas-horasextra) +
                    "\nHoras extra: " + horasextra +
                    "\nSalario total: " + pagototal);
        }
    }
}
