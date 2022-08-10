import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String nombre;
        String nombremadre;
        String nombrepadre;
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba su nombre completo");
        nombre = input.next();
        System.out.println("Escriba el nombre de su madre");
        nombremadre = input.next();
        System.out.println("Escriba el nombre de su padre");
        nombrepadre = input.next();
        System.out.println("Yo " + nombre + " soy hijo de " + nombremadre + " y " + nombrepadre +".");
    }
}