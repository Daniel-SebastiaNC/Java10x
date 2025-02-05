package NivelIntermediario.AbstractXInterface;

public class Uchiha extends Ninja{

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void mostrarInformacao() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

}
