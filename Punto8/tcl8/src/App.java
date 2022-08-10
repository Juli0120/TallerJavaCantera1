import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcion = 0, nota = 0,fin1, fin2, fin3, fin4, fin5, fin6, fin7, fin8;
        long tel1 = 0, tel2 = 0, tel3 = 0, tel4 = 0, tel5 = 0;
        String nom, nom1 = "", nom2 = "", nom3 = "", nom4 = "", nom5 = "", nom6 = "", nom7 = "", nom8 = "", curso1 = "",
                curso2 = "", curso3 = "", curso4 = "", curso5 = "", curso6 = "", curso7 = "", curso8 = "", nota1 = "",
                nota2 = "", nota3 = "", nota4 = "", nota5 = "", nota6 = "", nota7 = "", nota8 = "";
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Bienvenido a la escuela automovilística El Maestro  ¿Que desea hacer?");
            System.out.println("1. Ingresar usuario al curso");
            System.out.println("2. Consultar usuario que presetaron el curso");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Va a ingresar un nuevo usuario");
                    if (nom1 == "") {
                        System.out.println("Ingresar el nombre");
                        nom1 = input.next();
                        System.out.println("Ingresar curso a cursar");
                        curso1 = input.next();
                        nota1 = "cursando";
                    } else if (nom2 == "") {
                        System.out.println("Ingresar el nombre");
                        nom2 = input.next();
                        System.out.println("Ingresar curso a cursar");
                        curso2 = input.next();
                        nota2 = "cursando";
                    } else if (nom3 == "") {
                        System.out.println("Ingresar el nombre");
                        nom3 = input.next();
                        System.out.println("Ingresar curso a cursar");
                        curso3 = input.next();
                        nota3 = "cursando";
                    } else if (nom4 == "") {
                        System.out.println("Ingresar el nombre");
                        nom4 = input.next();
                        System.out.println("Ingresar curso a cursar");
                        curso4 = input.next();
                        nota4 = "cursando";
                    } else if (nom5 == "") {
                        System.out.println("Ingresar el nombre");
                        nom5 = input.next();
                        System.out.println("Ingresar curso a cursar");
                        curso5 = input.next();
                        nota5 = "cursando";
                    } else if (nom6 == "") {
                        System.out.println("Ingresar el nombre");
                        nom6 = input.next();
                        System.out.println("Ingresar curso a cursar");
                        curso6 = input.next();
                        nota6 = "cursando";
                    } else if (nom7 == "") {
                        System.out.println("Ingresar el nombre");
                        nom7 = input.next();
                        System.out.println("Ingresar curso a cursar");
                        curso7 = input.next();
                        nota7 = "cursando";
                    } else if (nom8 == "") {
                        System.out.println("Ingresar el nombre");
                        nom8 = input.next();
                        System.out.println("Ingresar curso a cursar");
                        curso8 = input.next();
                        nota8 = "cursando";
                    } else {
                        System.out.println("Se lleno la escuela");
                    }
                    break;
                case 2:
                    System.out.println("¿Que usuario desea consultar?");
                    nom = input.next();
                    if (nom.equals(nom1)) {
                        System.out.println("El nombre del usuario es " + nom1 + " en el curso " + curso1
                                + " y el curso se encuentra " + nota1);
                        System.out.println("¿Termino el curso?");
                        System.out.println("Si(1) No(0)");
                        fin1 = input.nextInt();
                        if (fin1==1) {
                            System.out.println("Ingresar la nota");
                            System.out.println("1. Aprobado");
                            System.out.println("2. Reprobado");
                            nota = input.nextInt();
                            switch (nota) {
                                case 1:
                                    nota1 = "aprovado";
                                    break;
                                case 2:
                                    nota1 = "reprobado";
                                    break;
                                default:
                                    System.out.println("Esa opción elegida no existe");
                            }
                        } else if(fin1==0){
                            nota1 = "cursando";
                        }else{
                            System.out.println("Esa opción no existe, queda de nuevo cursando");
                            nota1 = "cursando"; 
                        }
                    } else if (nom.equals(nom2)) {
                        System.out.println("El nombre del usuario es " + nom2 + " en el curso " + curso2
                                + " y el curso se encuentra " + nota2);
                        System.out.println("¿Termino el curso?");
                        System.out.println("Si(1) No(0)");
                        fin2 = input.nextInt();
                        if (fin2 == 1) {
                            System.out.println("Ingresar la nota");
                            System.out.println("1. Aprobado");
                            System.out.println("2. Reprobado");
                            nota = input.nextInt();
                            switch (nota) {
                                case 1:
                                    nota2 = "aprovado";
                                    break;
                                case 2:
                                    nota2 = "reprobado";
                                    break;
                                default:
                                    System.out.println("Esa opción elegida no existe");
                            }
                        }  else if(fin2==0){
                            nota2 = "cursando";
                        }else{
                            System.out.println("Esa opción no existe, queda de nuevo cursando");
                            nota2 = "cursando"; 
                        }
                    } else if (nom.equals(nom3)) {
                        System.out.println("El nombre del usuario es " + nom3 + " en el curso " + curso3
                                + " y el curso se encuentra " + nota3);
                        System.out.println("¿Termino el curso?");
                        System.out.println("Si(1) No(0)");
                        fin3 = input.nextInt();
                        if (fin3 == 1) {
                            System.out.println("Ingresar la nota");
                            System.out.println("1. Aprobado");
                            System.out.println("2. Reprobado");
                            nota = input.nextInt();
                            switch (nota) {
                                case 1:
                                    nota3 = "aprovado";
                                    break;
                                case 2:
                                    nota3 = "reprobado";
                                    break;
                                default:
                                    System.out.println("Esa opción elegida no existe");
                            }
                        } else if(fin3==0){
                            nota3 = "cursando";
                        }else{
                            System.out.println("Esa opción no existe, queda de nuevo cursando");
                            nota3 = "cursando"; 
                        }
                    } else if (nom.equals(nom4)) {
                        System.out.println("El nombre del usuario es " + nom4 + " en el curso " + curso4
                                + " y el curso se encuentra " + nota4);
                        System.out.println("¿Termino el curso?");
                        System.out.println("Si(1) No(0)");
                        fin4 = input.nextInt();
                        if (fin4 == 1) {
                            System.out.println("Ingresar la nota");
                            System.out.println("1. Aprobado");
                            System.out.println("2. Reprobado");
                            nota = input.nextInt();
                            switch (nota) {
                                case 1:
                                    nota4 = "aprovado";
                                    break;
                                case 2:
                                    nota4 = "reprobado";
                                    break;
                                default:
                                    System.out.println("Esa opción elegida no existe");
                            }
                        }  else if(fin4==0){
                            nota4 = "cursando";
                        }else{
                            System.out.println("Esa opción no existe, queda de nuevo cursando");
                            nota4 = "cursando"; 
                        }
                    } else if (nom.equals(nom5)) {
                        System.out.println("El nombre del usuario es " + nom5 + " en el curso " + curso5
                                + " y el curso se encuentra " + nota5);
                        System.out.println("¿Termino el curso?");
                        System.out.println("Si(1) No(0)");
                        fin5 = input.nextInt();
                        if (fin5 == 1) {
                            System.out.println("Ingresar la nota");
                            System.out.println("1. Aprobado");
                            System.out.println("2. Reprobado");
                            nota = input.nextInt();
                            switch (nota) {
                                case 1:
                                    nota5 = "aprovado";
                                    break;
                                case 2:
                                    nota5 = "reprobado";
                                    break;
                                default:
                                    System.out.println("Esa opción elegida no existe");
                            }
                        }  else if(fin5==0){
                            nota5 = "cursando";
                        }else{
                            System.out.println("Esa opción no existe, queda de nuevo cursando");
                            nota5 = "cursando"; 
                        }
                    } else if (nom.equals(nom6)) {
                        System.out.println("El nombre del usuario es " + nom6 + " en el curso " + curso6
                                + " y el curso se encuentra " + nota6);
                        System.out.println("¿Termino el curso?");
                        System.out.println("Si(1) No(0)");
                        fin6 = input.nextInt();
                        if (fin6 == 1) {
                            System.out.println("Ingresar la nota");
                            System.out.println("1. Aprobado");
                            System.out.println("2. Reprobado");
                            nota = input.nextInt();
                            switch (nota) {
                                case 1:
                                    nota6 = "aprovado";
                                    break;
                                case 2:
                                    nota6 = "reprobado";
                                    break;
                                default:
                                    System.out.println("Esa opción elegida no existe");
                            }
                        }  else if(fin6==0){
                            nota6 = "cursando";
                        }else{
                            System.out.println("Esa opción no existe, queda de nuevo cursando");
                            nota6 = "cursando"; 
                        }
                    } else if (nom.equals(nom7)) {
                        System.out.println("El nombre del usuario es " + nom7 + " en el curso " + curso7
                                + " y el curso se encuentra " + nota7);
                        System.out.println("¿Termino el curso?");
                        System.out.println("Si(1) No(0)");
                        fin7 = input.nextInt();
                        if (fin7 == 1) {
                            System.out.println("Ingresar la nota");
                            System.out.println("1. Aprobado");
                            System.out.println("2. Reprobado");
                            nota = input.nextInt();
                            switch (nota) {
                                case 1:
                                    nota7 = "aprovado";
                                    break;
                                case 2:
                                    nota7 = "reprobado";
                                    break;
                                default:
                                    System.out.println("Esa opción elegida no existe");
                            }
                        }  else if(fin7==0){
                            nota7 = "cursando";
                        }else{
                            System.out.println("Esa opción no existe, queda de nuevo cursando");
                            nota7 = "cursando"; 
                        }
                    } else if (nom.equals(nom8)) {
                        System.out.println("El nombre del usuario es " + nom8 + " en el curso " + curso8
                                + " y el curso se encuentra " + nota8);
                        System.out.println("¿Termino el curso?");
                        System.out.println("Si(1) No(0)");
                        fin8 = input.nextInt();
                        if (fin8 == 1) {
                            System.out.println("Ingresar la nota");
                            System.out.println("1. Aprobado");
                            System.out.println("2. Reprobado");
                            nota = input.nextInt();
                            switch (nota) {
                                case 1:
                                    nota8 = "aprovado";
                                    break;
                                case 2:
                                    nota8 = "reprobado";
                                    break;
                                default:
                                    System.out.println("Esa opción elegida no existe");
                            }
                        } else if(fin8==0){
                            nota8 = "cursando";
                        }else{
                            System.out.println("Esa opción no existe, queda de nuevo cursando");
                            nota8 = "cursando"; 
                        }
                    } else {
                        System.out.println("El usuario no esta inscrito");
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
