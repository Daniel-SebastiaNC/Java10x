package NivelIntermediario.HerançaMultipla;

public class Hatake extends  Ninja implements ISharingan, IAnbu{

    public Hatake() {
    }

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void boasVindas(){
        System.out.println(super.nome + ": Eu sou um Hatake");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println("Eu sou " + super.nome + " e ativei meu Sharingan(Clã Hatake)");
    }

    @Override
    public void ninjaElite() {
        System.out.println("Eu sou " + super.nome + ", sou um Anbu");
    }
}
