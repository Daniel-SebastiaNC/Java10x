package NivelIntermediario.AbstractXInterface;

public class Uzumaki extends Ninja{

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void mostrarInformacao() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

}
