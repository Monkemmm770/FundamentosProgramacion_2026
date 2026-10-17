public class DoWhileEjemplo {
    public static void main(String[] args){
        int contador = 0;
        do { //inicio de do-while
            System.out.println("Contador = " + contador);
            contador = contador + 1;
        }while (contador<=5);
        System.out.println("Continua el programa");
    }
}
