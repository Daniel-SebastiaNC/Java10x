package NivelIntermediario.Herança;

public class Boruto extends Uzumaki implements HyugaUzumaki{
    @Override
    public void ativarKarma() {
        System.out.println("Karma ativado! eu sou um HyugaUzumaki");
    }

    @Override
    public void ativarJougan() {
        System.out.println("Jougan ativado! eu sou um HyugaUzumaki");
    }
}
