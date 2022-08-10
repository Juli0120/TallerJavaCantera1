import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int usuarioId, opcion, peliId;
        String comentario;
        Scanner input = new Scanner(System.in);
        System.out.println("¿Qué cliente va a comprar?");
        System.out.println("1. Danna Uribe");
        System.out.println("2. Pablo Escobar");
        System.out.println("3. Andrés Castro");
        usuarioId = input.nextInt();
        switch (usuarioId) {
            case 1:
                System.out.println("Hola Danna Uribe, ¿Qué desea hacer?");
                System.out.println("1. Consultar precios de los productos");
                System.out.println("2. Comprar producto");
                System.out.println("3. Devoluciones");
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Las productos para comprar son");
                        System.out.println("1. Acetaminofen = $100");
                        System.out.println("2. Metrocarbamol = $2500");
                        System.out.println("3. Prueba de embarazo = $18000");
                        System.out.println("4. Condones = $12000");
                        System.out.println("5. Postday = $20000");
                        break;
                    case 2:
                        System.out.println("Productos");
                        System.out.println("1. Acetaminofen");
                        System.out.println("2. Metrocarbamol");
                        System.out.println("3. Prueba de embarazo");
                        System.out.println("4. Condones");
                        System.out.println("5. Postday");
                        System.out.println("¿Cual producto desea comprar?");
                        peliId = input.nextInt();
                        break;
                    case 3:

                        System.out.println("Productos");
                        System.out.println("1. Acetaminofen");
                        System.out.println("2. Metrocarbamol");
                        System.out.println("3. Prueba de embarazo");
                        System.out.println("4. Condones");
                        System.out.println("5. Postday");
                        System.out.println("¿Cual producto desea devolver?");
                        peliId = input.nextInt();
                        System.out.println("¿A que se debe esta decisión?");
                        comentario = input.next();
                        break;
                    default:
                        System.out.println("Esa opción elegida no existe");
                }
                break;
            case 2:
                System.out.println("Hola Pablo Escobar, ¿Qué desea hacer?");
                System.out.println("1. Consultar precios de los productos");
                System.out.println("2. Comprar producto");
                System.out.println("3. Devoluciones");
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Las productos para comprar son");
                        System.out.println("1. Acetaminofen = $100");
                        System.out.println("2. Metrocarbamol = $2500");
                        System.out.println("3. Prueba de embarazo = $18000");
                        System.out.println("4. Condones = $12000");
                        System.out.println("5. Postday = $20000");
                        break;
                    case 2:
                        System.out.println("Productos");
                        System.out.println("1. Acetaminofen");
                        System.out.println("2. Metrocarbamol");
                        System.out.println("3. Prueba de embarazo");
                        System.out.println("4. Condones");
                        System.out.println("5. Postday");
                        System.out.println("¿Cual producto desea comprar?");
                        peliId = input.nextInt();
                        break;
                    case 3:

                        System.out.println("Productos");
                        System.out.println("1. Acetaminofen");
                        System.out.println("2. Metrocarbamol");
                        System.out.println("3. Prueba de embarazo");
                        System.out.println("4. Condones");
                        System.out.println("5. Postday");
                        System.out.println("¿Cual producto desea devolver?");
                        peliId = input.nextInt();
                        System.out.println("¿A que se debe esta decisión?");
                        comentario = input.next();
                        break;
                    default:
                        System.out.println("Esa opción elegida no existe");
                }
                break;
            case 3:
                System.out.println("Hola Andrés Castro, ¿Qué desea hacer?");
                System.out.println("1. Consultar precios de los productos");
                System.out.println("2. Comprar producto");
                System.out.println("3. Devoluciones");
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Las productos para comprar son");
                        System.out.println("1. Acetaminofen = $100");
                        System.out.println("2. Metrocarbamol = $2500");
                        System.out.println("3. Prueba de embarazo = $18000");
                        System.out.println("4. Condones = $12000");
                        System.out.println("5. Postday = $20000");
                        break;
                    case 2:
                        System.out.println("Productos");
                        System.out.println("1. Acetaminofen");
                        System.out.println("2. Metrocarbamol");
                        System.out.println("3. Prueba de embarazo");
                        System.out.println("4. Condones");
                        System.out.println("5. Postday");
                        System.out.println("¿Cual producto desea comprar?");
                        peliId = input.nextInt();
                        break;
                    case 3:

                        System.out.println("Productos");
                        System.out.println("1. Acetaminofen");
                        System.out.println("2. Metrocarbamol");
                        System.out.println("3. Prueba de embarazo");
                        System.out.println("4. Condones");
                        System.out.println("5. Postday");
                        System.out.println("¿Cual producto desea devolver?");
                        peliId = input.nextInt();
                        System.out.println("¿A que se debe esta decisión?");
                        comentario = input.next();
                        break;
                    default:
                        System.out.println("Esa opción elegida no existe");
                }
                break;
            default:
                System.out.println("Esa opción elegida no existe");
        }
    }
}
