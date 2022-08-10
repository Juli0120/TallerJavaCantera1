import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int usuarioId, opcion, peliId;
        String comentario;
        Scanner input = new Scanner(System.in);
        System.out.println("¿Qué usuario va a alquilar?");
        System.out.println("1. Danna Uribe");
        System.out.println("2. Pablo Escobar");
        System.out.println("3. Andrés Castro");
        usuarioId = input.nextInt();
        switch (usuarioId) {
            case 1:
                    System.out.println("Hola Danna Uribe, ¿Qué desea hacer?");
                    System.out.println("1. Consultar películas disponibles");
                    System.out.println("2. Alquilar una película");
                    System.out.println("3. Recibir película");
                    opcion = input.nextInt();
                    switch(opcion){
                        case 1:
                                System.out.println("Las películas que tenemos disponibles son");
                                System.out.println("1. 50 sombras de Grey");
                                System.out.println("2. Una noche en el museo 2");
                                System.out.println("3. El viaje de Shihiro");
                                System.out.println("4. MARIE ANTOINETTE");
                                System.out.println("5. Mad Max");
                                break;
                        case 2:
                                System.out.println("Películas a alquilar");
                                System.out.println("1. 50 sombras de Grey");
                                System.out.println("2. Una noche en el museo 2");
                                System.out.println("3. El viaje de Shihiro");
                                System.out.println("4. MARIE ANTOINETTE");
                                System.out.println("5. Mad Max"); 
                                System.out.println("¿Cual película desea alquilar?");
                                peliId = input.nextInt();
                                break;
                        case 3: 
                                System.out.println("Me alegra que recibieras la película, ¿nos ayudas enunciando en que condición te llego?");
                                comentario = input.nextLine();
                                break;
                        default:
                                System.out.println("Esa opción elegida no existe");
                    }
                    break;
            case 2:
                    System.out.println("Hola Pablo Escobar, ¿Qué desea hacer?");
                    System.out.println("1. Consultar películas disponibles");
                    System.out.println("2. Alquilar una película");
                    System.out.println("3. Recibir película");
                    opcion = input.nextInt();
                    switch(opcion){
                        case 1:
                                System.out.println("Las películas que tenemos disponibles son");
                                System.out.println("1. 50 sombras de Grey");
                                System.out.println("2. Una noche en el museo 2");
                                System.out.println("3. El viaje de Shihiro");
                                System.out.println("4. MARIE ANTOINETTE");
                                System.out.println("5. Mad Max");
                                break;
                        case 2:
                                System.out.println("Películas a alquilar");
                                System.out.println("1. 50 sombras de Grey");
                                System.out.println("2. Una noche en el museo 2");
                                System.out.println("3. El viaje de Shihiro");
                                System.out.println("4. MARIE ANTOINETTE");
                                System.out.println("5. Mad Max"); 
                                System.out.println("¿Cual película desea alquilar?");
                                peliId = input.nextInt();
                                break;
                        case 3: 
                                System.out.println("Me alegra que recibieras la película, ¿nos ayudas enunciando en que condición te llego?");
                                comentario = input.nextLine();
                                break;
                        default:
                                System.out.println("Esa opción elegida no existe");
                    }
                    break;
            case 3:
                    System.out.println("Hola Andrés Castro, ¿Qué desea hacer?");
                    System.out.println("1. Consultar películas disponibles");
                    System.out.println("2. Alquilar una película");
                    System.out.println("3. Recibir película");
                    opcion = input.nextInt();
                    switch(opcion){
                        case 1:
                                System.out.println("Las películas que tenemos disponibles son");
                                System.out.println("1. 50 sombras de Grey");
                                System.out.println("2. Una noche en el museo 2");
                                System.out.println("3. El viaje de Shihiro");
                                System.out.println("4. MARIE ANTOINETTE");
                                System.out.println("5. Mad Max");
                                break;
                        case 2:
                                System.out.println("Películas a alquilar");
                                System.out.println("1. 50 sombras de Grey");
                                System.out.println("2. Una noche en el museo 2");
                                System.out.println("3. El viaje de Shihiro");
                                System.out.println("4. MARIE ANTOINETTE");
                                System.out.println("5. Mad Max"); 
                                System.out.println("¿Cual película desea alquilar?");
                                peliId = input.nextInt();
                                break;
                        case 3: 
                                System.out.println("Me alegra que recibieras la película, ¿nos ayudas enunciando en que condición te llego?");
                                comentario = input.nextLine();
                                break;
                        default:
                                System.out.println("Esa opción elegida no existe");
                    }
                    break;            
            default:
            System.out.println("Esa opción elegida no existe");
        }
    }
}