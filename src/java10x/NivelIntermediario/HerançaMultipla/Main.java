package NivelIntermediario.HerançaMultipla;

public class Main {
    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Folha", 16);
        sasuke.sharinganAtivado();

        Hatake kakashi = new Hatake("Kakashi Hatake", "Folha", 32);

        kakashi.sharinganAtivado();
        kakashi.ninjaElite();
    }
}
