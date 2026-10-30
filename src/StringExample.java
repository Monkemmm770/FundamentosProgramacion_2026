public class StringExample {
    public static void main (String[] args){
    String texto = "hola mundo java";
        System.out.println("length() ->" + texto.length());
        System.out.println("toUpperCase ->" + texto.toUpperCase());
        System.out.println("toLowerCase ->" + texto.toLowerCase());
        System.out.println("contains() ->" + texto.contains("Mundo"));
        System.out.println("equals() ->" + texto.equals("Hola mundo"));
        System.out.println("" + texto.equals("Hola mundo java"));
        System.out.println("equalsIgnoreCase() ->");
        System.out.println("substring ->" + texto.substring(0,4));
        System.out.println("charAt()" + texto.charAt(0));
        System.out.println("replace()" + texto.replace("Java", "Python"));
        String nombre = "       JUAN        ";
        System.out.println(nombre);
        System.out.println(nombre.trim());
        String palabra = "";
        System.out.println("IsEmpty ->" + palabra.isEmpty());



    }
}

