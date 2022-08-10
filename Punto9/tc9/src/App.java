import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcion;
        double base, baseMayor, altura, area;
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenidos a la super calculadora de áreas de figuras geométricas");
        System.out.println("¿Qué área desea calcular?");
        System.out.println("1. Área de un rectángulo");
        System.out.println("2. Área de un triángulo");
        System.out.println("3. Área de un Trapecio");
        opcion = input.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Favor ingresar valor de la base del rectángulo");
                base = input.nextDouble();
                System.out.println("Favor ingresar valor de la altura del rectángulo");
                altura = input.nextDouble();
                area = base * altura;
                System.out.println("El área de este rectángulo es de " + area);
                break;
            case 2:
                System.out.println("Favor ingresar valor de la base del triángulo");
                base = input.nextDouble();
                System.out.println("Favor ingresar valor de la altura del triángulo");
                altura = input.nextDouble();
                area = (base * altura) / 2;
                System.out.println("El área de este triángulo es de " + area);
                break;
            case 3:
                System.out.println("Favor ingresar valor de la base menor del trapecio");
                base = input.nextDouble();
                System.out.println("Favor ingresar valor de la base mayor del trapecio");
                baseMayor = input.nextDouble();
                System.out.println("Favor ingresar valor de la altura del trapecio");
                altura = input.nextDouble();
                area = ((base + baseMayor) / 2) * altura;
                System.out.println("El área de este trapecio es de " + area);
                break;
            default:
                System.out.println("Esa opción elegida no existe");
        }
    }
}
