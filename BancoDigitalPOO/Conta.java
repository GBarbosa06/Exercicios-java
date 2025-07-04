package BancoDigitalPOO;

import java.util.ArrayList;
import java.util.List;

public sealed abstract class Conta permits ContaCorrente, ContaPoupanca  {

    protected static final String AGENCIA_PADRAO = "0001";
    protected int sequencial = 0;

    protected String agencia = AGENCIA_PADRAO;
    protected int numero;
    protected double saldo = 0.0;
    protected List<String> extrato = new ArrayList<>();

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = sequencial++;
    }
    

    public String getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    private void adicionarAoExtrato(String dado){
        extrato.add(dado);
    }

    public void sacar(double valor){
        if (saldo >= valor) {
            saldo -= valor;
            adicionarAoExtrato(String.format("Saque no valor de R$%.2f", valor));
            System.out.printf("Saque de R$%.2f feito!\nSaldo atual: R$%.2f \n", valor, saldo);
        } else{
            System.out.println("Saldo insuficiente.");
        }
    }
    public void depositar(double valor){
        saldo += valor;
        adicionarAoExtrato(String.format("Deposito no valor de R$%.2f", valor));
        System.out.printf("Depósito de R$%.2f bem sucedido!\nNovo saldo: R$%.2f \n", valor, saldo);
    }
    public void transferir(double valor, Conta contaDestino){
        if (saldo >= valor) {
            saldo -= valor;
            contaDestino.saldo += valor;
            adicionarAoExtrato(String.format("Tranferencia para conta %d no valor de R$%.2f", contaDestino.numero, valor));
            contaDestino.adicionarAoExtrato(String.format("Tranferencia recebida da conta %d no valor de R$%.2f", numero, valor));
            System.out.printf("Transferência de R$%.2f feita!\nSeu saldo atual: R$%.2f \n", valor, saldo);
        } else{
            System.out.println("Saldo insuficiente.");
        }
    }

    public void verExtrato(){
        System.out.printf("Agência %s; Conta %s; Saldo R$%.2f \n", agencia, numero, saldo);

        if (!extrato.isEmpty()) {
            for (String dado : extrato) {
                System.out.println(" - " + dado);
            }
            System.out.println("");
        } else {
            System.out.println("Sem movimentação");
        }
    }
}
