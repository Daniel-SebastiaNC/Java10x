package NivelIntermediario.AbstractXInterface;

public class Uchiha extends Ninja{

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numMissoesConluidas, RankNinja rank) {
        super(nome, aldeia, idade, numMissoesConluidas, rank);
    }

    @Override
    public void mostrarInformacao() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    @Override
    public void inteligenciaDeBatalha() {
        super.inteligenciaDeBatalha();
    }

    @Override
    public void inteligenciaDeBatalha(int qi) {
        super.inteligenciaDeBatalha(qi);
    }
}
