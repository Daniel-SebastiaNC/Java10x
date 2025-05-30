package NivelIntermediario.AbstractXInterface;

public abstract class Ninja implements EstrategiaDeBatalha{

    //TODO: Incluir novos 2 atributos: numMissoesConluidas, rank
    //TODO: Rank: Gennin, Chunnin, Jounning, kage

    String nome;
    String aldeia;
    int idade;
    int numMissoesConluidas;
    RankNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do contrutor novos atributos


    public Ninja(String nome, String aldeia, int idade, int numMissoesConluidas, RankNinja rank) {
        this(nome, aldeia, idade);
        this.numMissoesConluidas = numMissoesConluidas;
        this.rank = rank;
    }

    public void mostrarInformacao(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Minha estratégia de batalha");
    }

    @Override
    public void inteligenciaDeBatalha() {
        System.out.println("Meu nome é: "+ nome + " Essa é minha INTELIGENCIA de combate");
    }

    @Override
    public void inteligenciaDeBatalha(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: "+ qi + " e voce é um genio");
        } else if (qi >= 130){
            System.out.println("Seu QI é: "+ qi + " e voce é promissor");
        } else {
            System.out.println("Seu QI é: "+ qi + " e precisa pensar mais");
        }
    }

    @Override
    public String toString() {
        return "Olha só";
    }
}
