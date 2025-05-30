package java10x.NivelIntermediario.Desafios.Desafio4;

public class Main {
    public static void main(String[] args) {
        //Ninja Básico
        NinjaBasico figurante = new NinjaBasico("Ambu inútil", 30, "shuriken");

        figurante.mostrarInformacoes();
        figurante.executarHabilidade();

        System.out.println("-------------------------------------------------");
        //Ninja Avançado
        NinjaAvancado rockLee = new NinjaAvancado("Rock Lee", 18, "Furacão da Folha", "Taijustsu");

        rockLee.mostrarInformacoes();
        rockLee.executarHabilidade();
    }
}
