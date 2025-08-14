package Aula1;

import java.util.Scanner;

public class ex001 {
// 1.Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses números.
    public static void main(String[] args) {
        int resultado = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite o valor %d: ", i+1);
            resultado += scanner.nextInt();
        }
        System.out.printf("A soma resulta em %d \n", resultado);
        
        scanner.close();
    }
}
