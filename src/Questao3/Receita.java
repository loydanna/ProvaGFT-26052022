package Questao3;

import java.util.List;
import java.util.Scanner;

public class Receita {
    public String nome;
    public int ingrediente;
    public int quant;
    public int tempoPreparo;
    public String modoDePreparo;


    @Override
    public String toString() {
        return "Receita{" +
                "nome='" + nome + '\'' +
                ", tempoPreparo=" + tempoPreparo +
                ", modoDePreparo='" + modoDePreparo + '\'' +
                '}';
    }

    public void ingredientes(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Qual seu ingrediente? 1- Ovo 2- Banana");
    ingrediente= entrada.nextInt();
        System.out.println("Você pode fazer receita de Omelete e Ovo frito");
        System.out.println("Qual a quantidade do ingrediente?");
        quant = entrada.nextInt();
        if( quant==1){
            System.out.println("Você pode fazer o Ovo frito" + toString());
        } else if (quant > 3) {
            System.out.println("Você pode fazer o Omelete" + toString());
        }



    if(ingrediente==2){
        System.out.println("Você pode fazer receita de Bolo e Torta");
        System.out.println("Qual a quantidade do ingrediente?");
        quant = entrada.nextInt();
        if( quant==1){
            System.out.println("Você pode fazer Torta"+ toString());
    } else if (quant > 3) {
            System.out.println("Você pode fazer o Bolo"+ toString());
        }
    }


}
}
