package NivelIntermediario.Desafios.Desafio5;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }
}
