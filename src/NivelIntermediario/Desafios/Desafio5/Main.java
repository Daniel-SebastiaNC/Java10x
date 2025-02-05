package NivelIntermediario.Desafios.Desafio5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(0);

        contaCorrente.depositar(20);
        contaCorrente.consultarSaldo();

        ContaPoupanca contaPoupanca = new ContaPoupanca(0);

        contaPoupanca.depositar(20);
        contaPoupanca.consultarSaldo();
    }
}
