public class App {
    public static void main(String[] args) throws Exception {
        int j,cont=0,i,c=0;
        int arreglo[];
        arreglo = new int[168];

        for(j=1;j<=1000;j++){
            for(i=1;i<=j;i++){
                if (j%i==0){
                    cont++;
                }
            }
            if(cont==2){
                arreglo[c]=j;
                c++;
            }
            cont=0;
        }

        for(int k=0;k<167;k++){
            System.out.print(arreglo[k] + " ");
        }

    }
}
