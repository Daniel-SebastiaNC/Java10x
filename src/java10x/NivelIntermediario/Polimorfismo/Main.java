package java10x.NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki(
                "Naruto Uzumaki",
                "Folha",
                17
                );


        naruto.habilidadeEspecial();

        Uchiha sasuke = new Uchiha(
                "Sasuke Uchiha",
                "Folha",
                17);

        sasuke.habilidadeEspecial();
    }
}
