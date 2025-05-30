package java10x.NivelIntermediario.Desafios.Desafio3;

public class Uchiha extends Ninja{

    String habilidadeEspecial;


    public Uchiha(String nome, int idade, String missao, char nivelDificuldade, String statusMissao, String habilidadeEspecial) {
        super(nome, idade, missao, nivelDificuldade, statusMissao);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        mostrarHabilidadeEspecial();
    }

    public void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade Especial: "+ habilidadeEspecial);
    }

}
