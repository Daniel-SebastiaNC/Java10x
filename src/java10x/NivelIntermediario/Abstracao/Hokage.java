package NivelIntermediario.Abstracao;

public abstract class Hokage {
    String nome;
    int idade;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public Hokage() {
    }

    public Hokage(String nome, int idade, String aldeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }

    public abstract void sabedoriaHokage();
}
