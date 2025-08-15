package Aula1;

import java.util.Scanner;

public class ex003 {
// 3.Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[3];
        int[] pesos = new int[3];
        int somaPesos = 0;
        double resultado = 0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite a nota %d: ", i+1);
            notas[i] = scanner.nextDouble();

            System.out.printf("Digite o peso da nota %d: ", i+1);
            pesos[i] = scanner.nextInt();

            resultado += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        resultado /= somaPesos;

        System.out.printf("A media das notas é %.2f", resultado);

        scanner.close();
    }
}
