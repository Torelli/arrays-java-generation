package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[10];
        int soma = 0;
        float media;
        String pares = "";
        String indicesImpares = "";

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "ª número: ");
            num[i] = input.nextInt();
            if(i  % 2 != 0) indicesImpares += num[i] + " ";
            if(num[i] % 2 == 0) pares += num[i] + " ";
            soma += num[i];
        }
        media = (float) soma / num.length;
        System.out.println("Elementos nos índices ímpares: \n" + indicesImpares);
        System.out.println("Elementos pares: \n" + pares);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + String.format("%.2f", media));
    }

}
