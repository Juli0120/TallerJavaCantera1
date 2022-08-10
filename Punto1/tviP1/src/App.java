import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String nombre;
        String apellido;
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba su nombre");
        nombre = input.next();
        System.out.println("Escriba su apellido");
        apellido = input.next();
        System.out.println("Hola " + nombre + " " + apellido);
    }
}
