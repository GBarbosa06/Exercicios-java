package Aula1;

import java.util.Scanner;

public class ex006 {
// 6.Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber, sabendo-se que o funcionário tem gratificação de 5% sobre o salário base e paga imposto de 7% sobre este salário.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário atual: ");
        double salario = scanner.nextDouble();

        // Gratificação
        salario += salario * 0.05;

        // Imposto sobre o salario (com a gratificação)
        salario -= salario * 0.07;

        System.out.printf("O salário final considerando a gratificação e o imposto é de R$%.2f \n", salario);

        scanner.close();
    }
}
