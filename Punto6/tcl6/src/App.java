import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcion = 0;
        long tel1 = 0, tel2 = 0, tel3 = 0;
        String nom = "", nom1 = "", nom2 = "", nom3 = "", orga1 = "", orga2 = "", orga3 = "";
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    if (nom1 == "") {
                        System.out.println("Guardando el primer contacto");
                        System.out.println("Favor ingrese nombre");
                        nom1 = input.next();
                        System.out.println("Favor ingrese el número telefono");
                        tel1 = input.nextLong();
                        System.out.println("Favor ingresar la organización");
                        orga1 = input.next();
                    } else if (nom2 == "") {
                        System.out.println("Guardando el segundo contacto");
                        System.out.println("Favor ingrese nombre");
                        nom2 = input.next();
                        System.out.println("Favor ingrese el número telefono");
                        tel2 = input.nextLong();
                        System.out.println("Favor ingresar la organización");
                        orga2 = input.next();
                    } else if (nom3 == "") {
                        System.out.println("Guardando el tercer contacto");
                        System.out.println("Favor ingrese nombre");
                        nom3 = input.next();
                        System.out.println("Favor ingrese el número telefono");
                        tel3 = input.nextLong();
                        System.out.println("Favor ingresar la organización");
                        orga3 = input.next();
                    } else {
                        System.out.println("No es posible agregar mas contactos");
                    }
                    break;
                case 2:
                    System.out.println("¿Que contacto desea buscar?");
                    nom = input.next();
                    if (nom.equals(nom1)) {
                        System.out.println("El nombre del contacto es " + nom1 + " y su número de telefono es " + tel1
                                + " y su organización es " + orga1);
                    } else if (nom.equals(nom2)) {
                        System.out.println("El nombre del contacto es " + nom2 + " y su número de telefono es " + tel2
                                + " y su organización es " + orga2);
                    } else if (nom.equals(nom3)) {
                        System.out.println("El nombre del contacto es " + nom3 + " y su número de telefono es " + tel3
                                + " y su organización es " + orga3);
                    } else {
                        System.out.println("El contacto no existe");
                    }
                    break;
                case 3:
                System.out.println("¿Que contacto desea eliminar?");
                nom = input.next();
                    if (nom.equals(nom1)) {
                        nom1 = "";
                        tel1 = 0;
                        orga1 = "";
                    } else if (nom.equals(nom2)) {
                        System.out.println("Contacto eliminado");
                        nom2 = "";
                        tel2 = 0;
                        orga2 = "";
                    } else if (nom.equals(nom3)) {
                        System.out.println("Contacto eliminado");
                        nom3 = "";
                        tel3 = 0;
                        orga3 = "";
                    } else {
                        System.out.println("El contacto no existe, no es posible eliminarte");
                    }
                    break;
                case 0:
                    System.out.println("El programa finalizó");
                    break;
                default:
                    System.out.println("Esa opción elegida no existe");
            }
        } while (opcion != 0);
    }
}