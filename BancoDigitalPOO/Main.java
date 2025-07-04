package BancoDigitalPOO;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente();

        ContaCorrente cc2 = new ContaCorrente();

        cc1.verExtrato();

        cc1.depositar(200);
        //cc1.verExtrato();
        cc1.sacar(50);
        cc1.verExtrato();
        cc1.transferir(50, cc2);
        cc2.verExtrato();

    }
}
