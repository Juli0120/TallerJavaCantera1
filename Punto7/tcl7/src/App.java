import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcion = 0;
        long tel1 = 0, tel2 = 0, tel3 = 0, tel4 = 0, tel5 = 0;
        String nom1 = "", nom2 = "", nom3 = "", nom4 = "", nom5 = "", marca1 = "", marca2 = "", marca3 = "",
                marca4 = "", marca5 = "", placa = "", placa1 = "", placa2 = "", placa3 = "", placa4 = "", placa5 = "";
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Bienvenido al parqueadero El guardián ¿Que desea hacer?");
            System.out.println("1. Ingresar vehículo al parqueadero");
            System.out.println("2. Retirar vehículo del parqueadero");
            System.out.println("3. Consultar vehículo en el parqueadero");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    if (placa1 == "") {
                        System.out.println("Ingresa el vehiculo uno");
                        System.out.println("Ingresar nombre del dueño del vehículo");
                        nom1 = input.next();
                        System.out.println("Ingresar el número de telefono del dueño del vehículo");
                        tel1 = input.nextLong();
                        System.out.println("Ingresar la placa del vehíulo");
                        placa1 = input.next();
                        System.out.println("Ingresar la marca del vehíulo");
                        marca1 = input.next();
                    } else if (placa2 == "") {
                        System.out.println("Ingresa el vehiculo dos");
                        System.out.println("Ingresar nombre del dueño del vehículo");
                        nom2 = input.next();
                        System.out.println("Ingresar el número de telefono del dueño del vehículo");
                        tel2 = input.nextLong();
                        System.out.println("Ingresar la placa del vehíulo");
                        placa2 = input.next();
                        System.out.println("Ingresar la marca del vehíulo");
                        marca2 = input.next();
                    } else if (placa3 == "") {
                        System.out.println("Ingresa el vehiculo tres");
                        System.out.println("Ingresar nombre del dueño del vehículo");
                        nom3 = input.next();
                        System.out.println("Ingresar el número de telefono del dueño del vehículo");
                        tel3 = input.nextLong();
                        System.out.println("Ingresar la placa del vehíulo");
                        placa3 = input.next();
                        System.out.println("Ingresar la marca del vehíulo");
                        marca3 = input.next();
                    } else if (placa4 == "") {
                        System.out.println("Ingresa el vehiculo cuatro");
                        System.out.println("Ingresar nombre del dueño del vehículo");
                        nom4 = input.next();
                        System.out.println("Ingresar el número de telefono del dueño del vehículo");
                        tel4 = input.nextLong();
                        System.out.println("Ingresar la placa del vehíulo");
                        placa4 = input.next();
                        System.out.println("Ingresar la marca del vehíulo");
                        marca4 = input.next();
                    } else if (placa5 == "") {
                        System.out.println("Ingresa el vehiculo cinco");
                        System.out.println("Ingresar nombre del dueño del vehículo");
                        nom5 = input.next();
                        System.out.println("Ingresar el número de telefono del dueño del vehículo");
                        tel5 = input.nextLong();
                        System.out.println("Ingresar la placa del vehíulo");
                        placa5 = input.next();
                        System.out.println("Ingresar la marca del vehíulo");
                        marca5 = input.next();
                    } else {
                        System.out.println("Se lleno el parqueadero");
                    }
                    break;
                case 2:
                    System.out.println("¿Que vehiculo va a salir?");
                    placa = input.next();
                    if (placa.equals(placa1)) {
                        System.out.println("Gracias por preferirnos");
                        nom1 = "";
                        tel1 = 0;
                        placa1 = "";
                        marca1 = "";
                    } else if (placa.equals(placa2)) {
                        System.out.println("Gracias por preferirnos");
                        nom2 = "";
                        tel2 = 0;
                        placa2 = "";
                        marca2 = "";
                    } else if (placa.equals(placa3)) {
                        System.out.println("Gracias por preferirnos");
                        nom3 = "";
                        tel3 = 0;
                        placa3 = "";
                        marca3 = "";
                    } else if (placa.equals(placa4)) {
                        System.out.println("Gracias por preferirnos");
                        nom4 = "";
                        tel4 = 0;
                        placa4 = "";
                        marca4 = "";
                    } else if (placa.equals(placa5)) {
                        System.out.println("Gracias por preferirnos");
                        nom5 = "";
                        tel5 = 0;
                        placa5 = "";
                        marca5 = "";
                    } else {
                        System.out.println("Ese vehiculo no se encuentra en el parqueadero");
                    }
                    break;
                case 3:
                    System.out.println("¿Que vehiculo desea consultar?");
                    placa = input.next();
                    if (placa.equals(placa1)) {
                        System.out.println("El vehiculo con placa " + placa1 + " de marca " + marca1
                                + " su dueño se llama " + nom1 + " y su número de telefono es " + tel1);
                    } else if (placa.equals(placa2)) {
                        System.out.println("El vehiculo con placa " + placa2 + " de marca " + marca2
                                + " su dueño se llama " + nom2 + " y su número de telefono es " + tel2);
                    } else if (placa.equals(placa3)) {
                        System.out.println("El vehiculo con placa " + placa3 + " de marca " + marca3
                                + " su dueño se llama " + nom3 + " y su número de telefono es " + tel3);
                    } else if (placa.equals(placa4)) {
                        System.out.println("El vehiculo con placa " + placa4 + " de marca " + marca4
                                + " su dueño se llama " + nom4 + " y su número de telefono es " + tel4);
                    } else if (placa.equals(placa5)) {
                        System.out.println("El vehiculo con placa " + placa5 + " de marca " + marca5
                                + " su dueño se llama " + nom5 + " y su número de telefono es " + tel5);
                    } else {
                        System.out.println("El vehiculo no entro al parqueadero");
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
