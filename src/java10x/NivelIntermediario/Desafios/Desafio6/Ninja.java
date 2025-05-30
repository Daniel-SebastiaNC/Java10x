package NivelIntermediario.Desafios.Desafio6;

public class Ninja {
    private final String nome;
    private final int idade;
    private final String vila;

    public Ninja(String nome, int idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getVila() {
        return vila;
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", idade: " + idade + ", vila: " + vila;
    }
}
