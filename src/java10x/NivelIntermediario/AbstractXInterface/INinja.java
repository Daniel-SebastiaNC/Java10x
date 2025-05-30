package java10x.NivelIntermediario.AbstractXInterface;

public interface INinja {

    //São valores FINAL (imutáveis)
    String nome = "Naruto";
    String aldeia = "Folha";
    int idade = 16;

    //É obrigatoriamente abstrata
    public void mostrarInformacoes();
}
