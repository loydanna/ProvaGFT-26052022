package Questao4;

import java.util.Scanner;

public class Maior {
    public int numero;
    public int maior = 0;
    public int[] numeros = new int[10];

    public void maior() {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0 ; i < 3; i++) {
            System.out.println("Digite três números:");
            numero = entrada.nextInt();
            numeros[i]= (numero);


            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println(numeros[0]+ " " + numeros[1] + " " + numeros[2]+ " " );
        System.out.println(maior + " eh o maior");
    }

}
