package java10x.NivelIntermediario.Polimorfismo;

public class Uzumaki extends Ninja{

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki, um ataque de vento");
    }
}
