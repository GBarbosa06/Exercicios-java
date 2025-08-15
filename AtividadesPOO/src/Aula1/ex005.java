package Aula1;

import java.util.Scanner;

public class ex005 {
// 5.Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e mostre o valor do aumento e o novo salário.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do salário atual: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o percentual do aumento: ");
        double percentualAumento = scanner.nextDouble();

        double aumento = salario * (percentualAumento/100);
        double novoSalario = salario + aumento;

        System.out.printf("O salário sofreu um aumento de R$%.2f. O novo salário é R$%.2f", aumento, novoSalario);

        scanner.close();

    }
}
