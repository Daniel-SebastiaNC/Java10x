package NivelIntermediario.Desafios.Desafio5;

public abstract class ContaBancaria implements IConta {

    double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo atual é de: R$" + saldo);
    }

    @Override
    public abstract void depositar(double valor);
}
