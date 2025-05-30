package NivelIntermediario.AbstractXInterface;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Naruto", "Folha", 16);

        naruto.mostrarInformacao();
        naruto.estrategiaDeBatalhaNinja();

        Uchiha sasuke = new Uchiha("Sasuke", "Folha", 17, 900, RankNinja.KAGE);
        sasuke.mostrarInformacao();

        System.out.println(sasuke.rank);

        sasuke.inteligenciaDeBatalha();
        sasuke.inteligenciaDeBatalha(190);

        System.out.println(sasuke);

        //System.out.println(RankNinja.values());
    }
}
