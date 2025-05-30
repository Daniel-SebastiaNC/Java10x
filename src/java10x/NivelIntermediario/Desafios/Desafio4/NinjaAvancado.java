package java10x.NivelIntermediario.Desafios.Desafio4;

public class NinjaAvancado extends NinjaBasico implements INinja{

    String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        super.executarHabilidade();
        System.out.println(nome +" tem especialidade em " + especialidade);
    }
}
