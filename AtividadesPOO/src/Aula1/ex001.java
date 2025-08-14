package Aula1;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        int resultado = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite um número inteiro: ");
            resultado += scanner.nextInt();
        }
        System.out.printf("A soma resulta em %d \n", resultado);
        
        scanner.close();
    }
}
