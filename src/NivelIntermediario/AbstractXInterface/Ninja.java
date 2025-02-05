package NivelIntermediario.AbstractXInterface;

public abstract class Ninja implements EstrategiaDeBatalha{

    String nome;
    String aldeia;
    int idade;

    public void mostrarInformacao(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Minha estratégia de batalha");
    }
}
