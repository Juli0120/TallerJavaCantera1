import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcion;
        String nombre = "";
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Menú de usuario");
            System.out.println("1. Captura nombre");
            System.out.println("2. Saludar persona");
            System.out.println("3. Salir del sistema");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Favor ingrese su nombre");
                    nombre = input.next();
                    break;
                case 2:
                    if (nombre.isEmpty()) {
                        System.out.println("No se a capturado nombre, no es posible saludar.");
                    } else {
                        System.out.println("Hola " + nombre);
                    }
                    break;
                case 3:
                    System.out.println("El programa finalizó");
                    break;
                default:
                    System.out.println("Esa opción elegida no existe");
            }
        } while (opcion != 3);
    }
}
