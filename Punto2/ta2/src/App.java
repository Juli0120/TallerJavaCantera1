import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        int arreglo[], j = 0, c = 0;
        arreglo = new int[20];
        for (int i = 0; i < 20; i++) {
            arreglo[i] = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        }

        System.out.print("Números pares: ");
        while (j < 20) {
            if (arreglo[j] % 2 == 0) {
                if(c==0){
                    System.out.print(arreglo[j]);
                    c++;
                }else{
                    System.out.print(", " + arreglo[j]);
                }
            }
            j++;
        }
        j=0;
        c=0;
        System.out.print("\nNúmeros impares: ");
        while (j < 20) {
            if (arreglo[j] % 2 != 0) {
                if(c==0){
                    System.out.print(arreglo[j]);
                    c++;
                }else{
                    System.out.print(", " + arreglo[j]);
                }
            }
            j++;
        }
    }
}
