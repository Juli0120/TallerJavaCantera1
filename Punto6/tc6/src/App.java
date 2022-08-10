import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int usuarioId, opcion, opcionR, pieza;
        String entradaFH, salidaFH, entradaEstado, salidaEstado, actividad;
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido a Taller El Maquinista ¿Que cliente va a ingresar?");
        System.out.println("1. Danna Uribe");
        System.out.println("2. Pablo Escobar");
        System.out.println("3. Andrés Castro");
        usuarioId = input.nextInt();
        switch (usuarioId) {
            case 1:
                System.out.println("Hola, ¿Que desea hacer?");
                System.out.println("1. Registro de entrada y estado");
                System.out.println("2. Registro de salida y estado");
                System.out.println("3. Actividades realizadas y piezas de recambio");
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Favor ingresar fecha y hora de ingreso");
                        entradaFH = input.next();
                        System.out.println("¿En que estado y condiciones ingreso al taller? (visto desde el dueño)");
                        entradaEstado = input.next();
                        break;
                    case 2:
                        System.out.println("Favor ingresar fecha y hora de salida");
                        salidaFH = input.next();
                        System.out.println("¿En que estado y condiciones salio del taller?");
                        salidaEstado = input.next();
                        break;
                    case 3:
                        System.out.println("Ingrese el procedimiento que realizo");
                        actividad = input.nextLine();
                        System.out.println("¿Se utilizaron piezas de recambio?");
                        System.out.println("1. Si");
                        System.out.println("2. No");
                        opcionR = input.nextInt();
                        switch (opcionR) {
                            case 1:
                                System.out.println("Favor elegir la pieza de recambio usada");
                                System.out.println("1. Pastilla de freno");
                                System.out.println("2. Pin de seguridad");
                                pieza = input.nextInt();
                                break;
                            case 2:
                                System.out.println("Gracias hasta la proxima");
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
                System.out.println("Hola, ¿Que desea hacer?");
                System.out.println("1. Registro de entrada y estado");
                System.out.println("2. Registro de salida y estado");
                System.out.println("3. Actividades realizadas y piezas de recambio");
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Favor ingresar fecha y hora de ingreso");
                        entradaFH = input.next();
                        System.out.println("¿En que estado y condiciones ingreso al taller? (visto desde el dueño)");
                        entradaEstado = input.next();
                        break;
                    case 2:
                        System.out.println("Favor ingresar fecha y hora de salida");
                        salidaFH = input.next();
                        System.out.println("¿En que estado y condiciones salio del taller?");
                        salidaEstado = input.next();
                        break;
                    case 3:
                        System.out.println("Ingrese el procedimiento que realizo");
                        actividad = input.nextLine();
                        System.out.println("¿Se utilizaron piezas de recambio?");
                        System.out.println("1. Si");
                        System.out.println("2. No");
                        opcionR = input.nextInt();
                        switch (opcionR) {
                            case 1:
                                System.out.println("Favor elegir la pieza de recambio usada");
                                System.out.println("1. Pastilla de freno");
                                System.out.println("2. Pin de seguridad");
                                pieza = input.nextInt();
                                break;
                            case 2:
                                System.out.println("Gracias hasta la proxima");
                                break;
                            default:
                                System.out.println("Esa opción elegida no existe");

                        }
                        break;
                    default:
                        System.out.println("Esa opción elegida no existe");
                }
                break;
            case 3:
                System.out.println("Hola, ¿Que desea hacer?");
                System.out.println("1. Registro de entrada y estado");
                System.out.println("2. Registro de salida y estado");
                System.out.println("3. Actividades realizadas y piezas de recambio");
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Favor ingresar fecha y hora de ingreso");
                        entradaFH = input.next();
                        System.out.println("¿En que estado y condiciones ingreso al taller? (visto desde el dueño)");
                        entradaEstado = input.next();
                        break;
                    case 2:
                        System.out.println("Favor ingresar fecha y hora de salida");
                        salidaFH = input.next();
                        System.out.println("¿En que estado y condiciones salio del taller?");
                        salidaEstado = input.next();
                        break;
                    case 3:
                        System.out.println("Ingrese el procedimiento que realizo");
                        actividad = input.nextLine();
                        System.out.println("¿Se utilizaron piezas de recambio?");
                        System.out.println("1. Si");
                        System.out.println("2. No");
                        opcionR = input.nextInt();
                        switch (opcionR) {
                            case 1:
                                System.out.println("Favor elegir la pieza de recambio usada");
                                System.out.println("1. Pastilla de freno");
                                System.out.println("2. Pin de seguridad");
                                pieza = input.nextInt();
                                break;
                            case 2:
                                System.out.println("Gracias hasta la proxima");
                                break;
                            default:
                                System.out.println("Esa opción elegida no existe");

                        }
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