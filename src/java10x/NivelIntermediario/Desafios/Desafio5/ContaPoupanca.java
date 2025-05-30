package java10x.NivelIntermediario.Desafios.Desafio5;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor+(0.01*valor);
    }
}
