package Questao1;

import java.util.Scanner;

public class Pessoa {
    public String nome, genero, corOlhos, corCabelo, tipS, rh;
    public int dataN;
    public int ano;
    public String mae;
    public String pai;
    public int verde;
    public int castanho;
    public int azul;

    public void pessoa(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o ano do seu nascimento?" );
        ano = entrada.nextInt();

        dataN = 2022 - ano;

        System.out.println(" A sua idade é " + dataN);
    }

    public void corDosOlhos(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a cor dos olhos da Mãe?" );
        mae = entrada.nextLine();

        System.out.println("Qual a cor dos olhos do Pai?" );
        pai = entrada.nextLine();

        if ( pai.equalsIgnoreCase("verde")) verde++;
        if ( pai.equalsIgnoreCase("azul")) azul++;
        if ( pai.equalsIgnoreCase("castanho")) castanho++;

        if ( mae.equalsIgnoreCase("verde")) verde++;
        if ( mae.equalsIgnoreCase("azul")) azul++;
        if ( mae.equalsIgnoreCase("castanho")) castanho++;

        if(castanho==2) System.out.println("75% castanho/19% verdes/6% azuis");
        if(verde==1 && castanho==1) System.out.println("50% castanho/37% verdes/12% azuis");
        if(azul==1 && castanho ==1) System.out.println("50% castanho/0% verdes/50% azuis");
        if(verde==2) System.out.println("-1% castanho/75% verdes/25% azuis");
        if(azul==1 && verde ==1) System.out.println("0% castanho/50% verdes/50% azuis");
    }

}
