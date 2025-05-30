package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    private List<T> ferramentas;

    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    public void adiconarFerramenta(T ferramenta) {
        this.ferramentas.add(ferramenta);
    }

    public void mostrarFerramenta(){
        for (T ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }
    }

    public List<T> getFerramentas() {
        return ferramentas;
    }

    public void setFerramentas(List<T> ferramentas) {
        this.ferramentas = ferramentas;
    }

    @Override
    public String toString() {
        return "BolsaNinja: " + ferramentas.toString();
    }
}
