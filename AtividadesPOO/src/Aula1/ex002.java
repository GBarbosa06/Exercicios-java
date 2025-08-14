package Aula1;

import java.util.Scanner;

public class ex002 {
// 2. Faça um programa que receba três notas, calcule e mostre a média aritmética entre elas.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media;
        double soma = 0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o valor %d: ", i+1);
            soma += scanner.nextInt();
        }
        media = soma / 3;
        System.out.printf("A media aritmética é %.2f \n", media);

        scanner.close();
    }
}
