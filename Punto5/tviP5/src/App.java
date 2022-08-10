import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String nomMascota;
        int edadMascota;
        String tipoMascota;
        String nombre;
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba el nombre de su mascota");
        nomMascota = input.next();
        System.out.println("Escriba la edad de su mascota");
        edadMascota = input.nextInt();
        System.out.println("Escriba el tipo de mascota que tiene");
        tipoMascota = input.next();
        System.out.println("Escriba su nombre completo (dueño)");
        nombre = input.next();
        System.out.println(nomMascota + " es un(a) " + tipoMascota +"(a), el cual, tiene " + edadMascota + " años de edad y " + nombre + " es actualmente su dueño(a).");
    }
}