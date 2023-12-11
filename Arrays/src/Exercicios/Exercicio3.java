package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int num;

        for(int linha = 0; linha < 3; linha++) {
            for(int coluna = 0; coluna < 3; coluna++) {
                System.out.println("Digite o número da linha " + linha + " coluna " + coluna);
                num = input.nextInt();
                matriz[linha][coluna] = num;
            }
        }

        System.out.println("Elementos da Diagonal Principal: \n" + matriz[0][0] + " " + matriz[1][1] + " " + matriz[2][2]);
        System.out.println("Elementos da Diagonal Secunária: \n" + matriz[0][2] + " " + matriz[1][1] + " " + matriz[2][0]);
        System.out.println("Soma dos Elementos da Diagonal Principal: \n" + (matriz[0][0] + matriz[1][1] + matriz[2][2]));
        System.out.println("Soma dos Elementos da Diagonal Secundária: \n" + (matriz[0][2] + matriz[1][1] + matriz[2][0]));


    }

}
