import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String nombre;
        String apellido;
        int edad;
        double estatura;
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba su nombre");
        nombre = input.next();
        System.out.println("Escriba su apellido");
        apellido = input.next();
        System.out.println("Escriba su edad");
        edad = input.nextInt();
        System.out.println("Escriba su estatura (metros)");
        estatura = input.nextDouble();
        System.out.println("Hola " + nombre + " " + apellido + " tiene " + edad + " años de edad y mide " + estatura + " metros de altura.");
    }
}
