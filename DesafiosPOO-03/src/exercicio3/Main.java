package exercicio3;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000);
        conta.depositar(500);
        conta.consultarSaldo();
        conta.sacar(500);
        conta.consultarSaldo();

        System.out.println();
        ContaCorrente contaCorrente = new ContaCorrente(1000, 50);
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(50);
        contaCorrente.consultarSaldo();
    }
}
