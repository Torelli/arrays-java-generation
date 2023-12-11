package Exercicios;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float[][] matriz = new float[10][4];
        float[] medias = new float[10];

        for(int participante = 0; participante < 10; participante++) {
            medias[participante] = 0;
            for(int nota = 0; nota < 4; nota++) {
                System.out.println("Digite a nota " + (nota + 1) + " do participante " + (participante + 1));
                matriz[participante][nota] = input.nextFloat();
                medias[participante] += matriz[participante][nota];
            }
            medias[participante] /= 4;
            medias[participante] = round(medias[participante], 1);
        }

        System.out.println("Vetor: \n" + Arrays.toString(medias));

    }

    private static float round (float value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (float) Math.round(value * scale) / scale;
    }

}
