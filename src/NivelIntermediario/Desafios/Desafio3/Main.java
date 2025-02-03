package NivelIntermediario.Desafios.Desafio3;

public class Main {
    public static void main(String[] args) {
        Ninja naruto = new Ninja(
                "Naruto Uzumaki",
                16,
                "Resgatar gato",
                'C',
                "Em andamento");
        naruto.mostrarInformacoes();

        System.out.println("-------------------------------------------------------");

        Uchiha sasuke = new Uchiha(
                "Sasuke Uchiha",
                17,
                "Combater Mercenários",
                'B',
                "Em andamento",
                "Sharingan");
        sasuke.mostrarInformacoes();
    }
}
