import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int usuarioId, opcion, opcionIni, tortaId, cantidad3Leche, cantidadCho, cantidadGeno;
        Scanner input = new Scanner(System.in);
        System.out.println("¿Qué usuario va a alquilar?");
        System.out.println("1. Pedido");
        System.out.println("2. Ingresar ventas");
        opcionIni = input.nextInt();
        switch (opcionIni) {
            case 1:
                System.out.println("¿Que cliente va a comprar?");
                System.out.println("1. Danna Uribe");
                System.out.println("2. Pablo Escobar");
                System.out.println("3. Andrés Castro");
                usuarioId = input.nextInt();
                switch (usuarioId) {
                    case 1:
                        System.out.println("Hola Danna, ¿Que desea hacer?");
                        System.out.println("1. Consultar tortas");
                        System.out.println("2. Realizar una compra");
                        opcion = input.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println("Tortas");
                                System.out.println("1. Chocolate, 10 porciones, fresas y mango");
                                System.out.println("2. Genovesa, 8 porciones, cereza y chispitas chocolate");
                                System.out.println("3. Tres leches, 10 porciones, cobertura de dulce");
                                break;
                            case 2:
                                System.out.println("1. Chocolate");
                                System.out.println("2. Genovesa");
                                System.out.println("3. Tres leches");
                                System.out.println("¿Cual torta desea comprar?");
                                tortaId = input.nextInt();
                                break;
                            default:
                                System.out.println("Esa opción elegida no existe");
                        }
                        break;
                    case 2:
                        System.out.println("Hola Pablo, ¿Que desea hacer?");
                        System.out.println("1. Consultar tortas");
                        System.out.println("2. Realizar una compra");
                        opcion = input.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println("Tortas");
                                System.out.println("1. Chocolate, 10 porciones, fresas y mango");
                                System.out.println("2. Genovesa, 8 porciones, cereza y chispitas chocolate");
                                System.out.println("3. Tres leches, 10 porciones, cobertura de dulce");
                                break;
                            case 2:
                                System.out.println("1. Chocolate");
                                System.out.println("2. Genovesa");
                                System.out.println("3. Tres leches");
                                System.out.println("¿Cual torta desea comprar?");
                                tortaId = input.nextInt();
                                break;
                            default:
                                System.out.println("Esa opción elegida no existe");
                        }
                        break;
                    case 3:
                        System.out.println("Hola Andrés, ¿Que desea hacer?");
                        System.out.println("1. Consultar tortas");
                        System.out.println("2. Realizar una compra");
                        opcion = input.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println("Tortas");
                                System.out.println("1. Chocolate, 10 porciones, fresas y mango");
                                System.out.println("2. Genovesa, 8 porciones, cereza y chispitas chocolate");
                                System.out.println("3. Tres leches, 10 porciones, cobertura de dulce");
                                break;
                            case 2:
                                System.out.println("1. Chocolate");
                                System.out.println("2. Genovesa");
                                System.out.println("3. Tres leches");
                                System.out.println("¿Cual torta desea comprar?");
                                tortaId = input.nextInt();
                                break;
                            default:
                                System.out.println("Esa opción elegida no existe");
                        }
                        break;
                    default:
                        System.out.println("Esa opción elegida no existe");
                }
                break;
            case 2:
                System.out.println("¿Cuantas tortas de chocolate se vendieron hoy?");
                cantidadCho = input.nextInt();
                System.out.println("¿Cuantas tortas de genovesa se vendieron hoy?");
                cantidadGeno = input.nextInt();
                System.out.println("¿Cuantas tortas de tres leches se vendieron hoy?");
                cantidad3Leche = input.nextInt();
                break;
            default:
                System.out.println("Esa opción elegida no existe");
        }
    }
}