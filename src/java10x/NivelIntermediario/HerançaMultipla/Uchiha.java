package NivelIntermediario.HerançaMultipla;

public class Uchiha extends Ninja implements ISharingan{

    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void sharinganAtivado() {
        System.out.println("Eu sou " + super.nome + " e ativei meu Sharingan(Clã Uchiha)");
    }
}
