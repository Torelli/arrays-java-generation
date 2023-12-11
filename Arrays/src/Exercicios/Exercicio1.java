package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[10];
        int numero, posicao = -1;
        boolean encontrado = false;

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "ª número: ");
            num[i] = input.nextInt();

            for(int j = 0; j < num.length; j++) {
                if(j != i) {
                    while (num[i] == num[j]) {
                        System.out.println("Os números não podem se repetir! Digite um novo número");
                        num[i] = input.nextInt();
                    }
                }
            }
        }
        System.out.println("Digite o número que você deseja encontrar: ");
        numero = input.nextInt();

        for(int i = 0; i < 10; i++) {
            if(num[i] == numero) {
                encontrado = true;
                posicao = i;
            }
        }

        if(encontrado) {
            System.out.println("O número " + numero + " está na posição: " + posicao);
        } else {
            System.out.println("O número " + numero + " não foi encontrado!");
        }

    }

}
