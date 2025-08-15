package Aula1;

import java.util.Scanner;

public class ex004 {
// 4.Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();

        salario += salario * 0.25;

        System.out.printf("O novo salário é R$%.2f \n", salario);

        scanner.close();
    }
}
