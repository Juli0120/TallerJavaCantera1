public class App {
    public static void main(String[] args) throws Exception {
        int i=0, j=0, c=10;
        while(i<10){
            for(int k=0;k<c;k++){
                System.out.print(" ");
            }
            c--;
            while(j<i){
                System.out.print("*");
                j++;
            }
        System.out.println("");
        j=0;
        i++;
        }
    }
}
