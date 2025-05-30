package NivelIntermediario.Desafios.Desafio4;

public class NinjaBasico implements INinja{

    String nome;
    int idade;
    String habilidade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println(
                "Nome: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Habilidade: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome +" usou a habilidade: " + habilidade);
    }
}
