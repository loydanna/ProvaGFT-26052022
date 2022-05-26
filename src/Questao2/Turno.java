package Questao2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Turno {
    public static String turno;

    public static ArrayList<String> tur = new ArrayList<>();

    public static void turnos(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual seu turno de trabalho? M- matutino, V-vespertino, N- Noturno");
        turno = entrada.nextLine();
        tur.add(turno);

        System.out.print("O seu turno é  ");
        switch (tur.get(0)){
            case "M" :
            if( tur.contains("M")){
            System.out.println("Matutino");}
            break;
            case "V" :
            if( tur.contains("V")){
                System.out.println("Vespertino");}
                break;
            case "N" :
            if( tur.contains("N")){
                System.out.println("Noturno");}
                break;
            default:
                if(tur.isEmpty() || !tur.contains("M") || !tur.contains("V") || !tur.contains("N"))
                System.out.println("Turno inválido!");

        }
    }
}
