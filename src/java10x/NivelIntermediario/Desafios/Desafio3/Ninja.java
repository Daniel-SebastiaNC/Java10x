package java10x.NivelIntermediario.Desafios.Desafio3;

public class Ninja {
    String nome;
    int idade;
    String missao;
    char nivelDificuldade;
    String statusMissao;

    public Ninja(String nome, int idade, String missao, char nivelDificuldade, String statusMissao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusMissao = statusMissao;
    }

    public void mostrarInformacoes(){
        System.out.println(
                "Nome: " + nome + "\n"
                +"Idade: " + idade + "\n"
                +"Missão: " + missao + "\n"
                +"Nível Dificuldade: " + nivelDificuldade + "\n"
                +"Status Missão: " + statusMissao
        );
    }
}
