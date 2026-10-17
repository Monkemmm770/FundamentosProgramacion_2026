import java.util.Scanner;

public class SistemaClasificacionEquipaje {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombrepasajero;
        int pesoequipaje = 0;
        int precioapagar = 0;
        final int PESO_MAXIMO = 30;
        final int CARGO_LIGERO = 150;
        final int CARGO_MEDIO = 300;
        final int CARGO_PESADO = 500;
        System.out.println("Escribe el nombre del pasajero");
        nombrepasajero = scanner.nextLine();
        System.out.println("Escribe el peso de tu equipaje");
        pesoequipaje = scanner.nextInt();
        if (pesoequipaje <= 0){
            System.out.println("El peso de tu equipaje debe ser mayor a 0");
        }
        if (pesoequipaje <= 15) {
            precioapagar = 0;
        } else if (pesoequipaje <= 20) {
            precioapagar = CARGO_LIGERO;
        } else if (pesoequipaje <= PESO_MAXIMO) {
            precioapagar = CARGO_MEDIO;
        } else {
            precioapagar = CARGO_PESADO;
            System.out.println("El peso de tu equipaje supera el limite");
        }
        System.out.println("Nombre del pasajero: " + nombrepasajero);
        System.out.println("Peso del equipaje:" + pesoequipaje + " Kilos");
        System.out.println("Cargo por equipaje: " + precioapagar);

        }

    }
