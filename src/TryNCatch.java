public class TryNCatch {
            static void main() {


                try{
                    String n = null;
                    System.out.println(n.length());
                }catch (NullPointerException e){
                    System.out.println("No puedes ejecutar metodos null");
                }
            }
        }
