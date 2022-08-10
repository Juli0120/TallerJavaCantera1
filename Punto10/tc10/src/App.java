import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int usuario, opcion, ingreso, retiro, usuario1Cant, usuario2Cant, usuario3Cant;
        String usuario1Nom, usuario2Nom, usuario3Nom;
        usuario1Nom = "Danna Uribe";
        usuario1Cant = 1500000;
        usuario2Nom = "Pablo Escobar";
        usuario2Cant = 200000000;
        usuario3Nom = "Andrés Castro";
        usuario3Cant = 500000;
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenidos al banco Su banco fiel");
        System.out.println("¿Qué usuario va a ingresar?");
        System.out.println("1. " + usuario1Nom);
        System.out.println("2. " + usuario2Nom);
        System.out.println("3. " + usuario3Nom);
        usuario = input.nextInt();
        switch (usuario) {
            case 1:
                System.out.println(usuario1Nom + " Qué desea hacer");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Realizar un ingreso");
                System.out.println("3. Realizar un retiro");
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("El saldo actual de " + usuario1Nom + " es de " + usuario1Cant);
                        break;
                    case 2:
                        System.out.println("¿De que valor es el ingreso a realizar?");
                        ingreso = input.nextInt();
                        if (ingreso < 0) {
                            System.out.println("No se permiten valores negativos ni 0");
                        } else {
                            usuario1Cant = usuario1Cant + ingreso;
                            System.out.println("El saldo actual de " + usuario1Nom + " es de " + usuario1Cant);
                        }
                        break;
                    case 3:
                        System.out.println("¿De que valor es el retiro a realizar?");
                        retiro = input.nextInt();
                        if (retiro > usuario1Cant) {
                            System.out.println("No es posible retirar ese valor, su cuenta no presenta esa cantidad");
                        } else {
                            usuario1Cant = usuario1Cant - retiro;
                            System.out.println("El saldo actual de " + usuario1Nom + " es de " + usuario1Cant);
                        }
                        break;
                    default:
                        System.out.println("Esa opción elegida no existe");
                }
            break;
            case 2:
                System.out.println(usuario2Nom + " Qué desea hacer");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Realizar un ingreso");
                System.out.println("3. Realizar un retiro");
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("El saldo actual de " + usuario2Nom + " es de " + usuario2Cant);
                        break;
                    case 2:
                        System.out.println("¿De que valor es el ingreso a realizar?");
                        ingreso = input.nextInt();
                        if (ingreso < 0) {
                            System.out.println("No se permiten valores negativos ni 0");
                        } else {
                            usuario2Cant = usuario2Cant + ingreso;
                            System.out.println("El saldo actual de " + usuario2Nom + " es de " + usuario2Cant);
                        }
                        break;
                    case 3:
                        System.out.println("¿De que valor es el retiro a realizar?");
                        retiro = input.nextInt();
                        if (retiro > usuario2Cant) {
                            System.out.println("No es posible retirar ese valor, su cuenta no presenta esa cantidad");
                        } else {
                            usuario2Cant = usuario2Cant - retiro;
                            System.out.println("El saldo actual de " + usuario2Nom + " es de " + usuario2Cant);
                        }
                        break;
                    default:
                        System.out.println("Esa opción elegida no existe");
                }
            break;
            case 3:
                System.out.println(usuario3Nom + " Qué desea hacer");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Realizar un ingreso");
                System.out.println("3. Realizar un retiro");
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("El saldo actual de " + usuario3Nom + " es de " + usuario3Cant);
                        break;
                    case 2:
                        System.out.println("¿De que valor es el ingreso a realizar?");
                        ingreso = input.nextInt();
                        if (ingreso < 0) {
                            System.out.println("No se permiten valores negativos ni 0");
                        } else {
                            usuario3Cant = usuario3Cant + ingreso;
                            System.out.println("El saldo actual de " + usuario3Nom + " es de " + usuario3Cant);
                        }
                        break;
                    case 3:
                        System.out.println("¿De que valor es el retiro a realizar?");
                        retiro = input.nextInt();
                        if (retiro > usuario3Cant) {
                            System.out.println("No es posible retirar ese valor, su cuenta no presenta esa cantidad");
                        } else {
                            usuario3Cant = usuario3Cant - retiro;
                            System.out.println("El saldo actual de " + usuario3Nom + " es de " + usuario3Cant);
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
