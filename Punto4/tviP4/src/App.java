import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String ciudad;
        String pais;
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba una ciudad capital");
        ciudad = input.next();
        System.out.println("Escriba el nombre del país de esa capital");
        pais = input.next();
        System.out.println("La ciudad " + ciudad + ", es la capital del país" + pais);
    }
}
