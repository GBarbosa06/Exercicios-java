package ContaBanco.src;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite Seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o número da agência: ");
        String agencia = scanner.nextLine();
        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nome, numero, agencia, saldo);


        scanner.close();
    }
}
