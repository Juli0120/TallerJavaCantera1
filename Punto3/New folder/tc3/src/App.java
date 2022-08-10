import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String nombre;
        String apellidos;
        int edad;
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba su nombre");
        nombre = input.next();
        System.out.println("EScriba sus apellidos");
        apellidos = input.next();
        System.out.println("Escriba su edad");
        edad = input.nextInt();
        if(edad >= 18){
            System.out.println(nombre + " " + apellidos + " usted es mayor de edad, por lo tanto puede entrar a la fiesta.");
        }else{
            System.out.println(nombre + " " + apellidos + " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }
    }
}
