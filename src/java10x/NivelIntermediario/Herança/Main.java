package java10x.NivelIntermediario.Herança;

public class Main {
    public static void main(String[] args) {

        //Ninja 1
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Folha";
        naruto.idade = 17;

        naruto.modoSabioAtivado();

        //Ninja 2
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Folha";
        sasuke.idade = 18;

        sasuke.ShariganAtivado();

        //Ninja 3
        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata Hyuga";
        hinata.idade = 17;
        hinata.aldeia = "Folha";

        hinata.byakuganAtivado();

        //Ninja 3

        Boruto boruto = new Boruto();
        boruto.aldeia = "Folha";
        boruto.nome = "Boruto Uzumaki";
        boruto.idade = 9;

        boruto.ativarJougan();
        boruto.ativarKarma();
        boruto.modoSabioAtivado();
    }
}
