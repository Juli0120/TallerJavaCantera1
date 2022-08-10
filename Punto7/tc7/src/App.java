import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int edad;
        double altura, imc, peso;
        String nombre;
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido al calculador de IMC (Índice de masa corporal)");
        System.out.println("Ingrese su nombre");
        nombre = input.next();
        System.out.println("Ingrese su edad");
        edad = input.nextInt();
        System.out.println("Ingrese su peso");
        peso = input.nextDouble();
        System.out.println("Ingrese su altura (en metros)");
        altura = input.nextDouble();

        imc = peso/(Math.pow(altura,2));

        if (imc < 18.5){
            System.out.println("Ud tiene bajo peso");
        }else if (imc >= 18.5 && imc < 25){
            System.out.println("Ud tiene peso normal");
        }else if (imc >= 25 && imc < 30){
            System.out.println("Ud tiene sobrepeso");
        }else if (imc >= 30){
            System.out.println("Ud tiene obesidad");
        }
    }
}
