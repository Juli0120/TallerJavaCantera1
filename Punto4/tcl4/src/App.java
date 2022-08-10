import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num,res;
        Scanner input = new Scanner(System.in);
        System.out.println("¿De que número desea sacar tabla de multiplicar hasta el 10?");
        num = input.nextInt();
        for(int i=1;i<11;i++){
            res = i*num;
            System.out.println(i + " x " + num + " = " + res);
        }
    }
}
