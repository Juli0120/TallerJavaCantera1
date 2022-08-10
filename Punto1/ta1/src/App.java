import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int arreglo[];
        arreglo = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i = 0;i < arreglo.length;i++){
            System.out.println("Ingrese un número");
            arreglo[i]=input.nextInt();
        }
        for(int j = 0;j < arreglo.length;j++){
            System.out.println("["+j+"] = "+ arreglo[j]);
        }
    }
}
