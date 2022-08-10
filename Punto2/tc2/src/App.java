import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int edad;
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba su edad");
        edad = input.nextInt();
        if(edad < 18){
            System.out.println("Usted aún es un niño(a)");
        }
    }
}