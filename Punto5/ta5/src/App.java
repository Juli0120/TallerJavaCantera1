import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int fila, columna, opcion=0;
        int [][] matriz = new int[10][10]; 
        Scanner input = new Scanner(System.in);
        for(fila=0;fila<10;fila++){
            for(columna=0;columna<10;columna++){
                matriz[fila][columna]=((fila+1)*(columna+1));
            }
        }
        do{
            for(fila=0;fila<=10;fila++){
                if(fila==0){
                    for(columna=1;columna<=10;columna++){
                        System.out.print(" "+ (columna-1) +"  ");
                    }
                }else{
                    for(columna=1;columna<=10;columna++){
                        System.out.print(columna + "x" + fila + " ");
                    }
                }
                if(fila>=1){
                    System.out.println(fila-1);
                }else{
                    System.out.println(" ");
                }
            }

            System.out.println("¿Qué valor de multiplicación desea saber?");
            System.out.println("Favor indicar fila");
            fila = input.nextInt();
            System.out.println("Favor indicar columna");
            columna = input.nextInt();
            System.out.println("El resultado es " + matriz[fila][columna]);
            System.out.println("¿Desea volver a consultar otro valor?");
            System.out.println("Si(1) No(0)");
            opcion = input.nextInt();
            if (opcion == 0){
                System.out.println("Gracias, hasta pronto");
            }

        }while(opcion != 0);
    }
}
