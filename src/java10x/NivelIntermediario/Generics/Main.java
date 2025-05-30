package NivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {
        /*EquipamentosNinja kunai = new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja bombaDeFumaca = new EquipamentosNinja("Bomba de Fumaca");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();

        bolsaGenerica.adiconarEquipamento(kunai);
        bolsaGenerica.adiconarEquipamento(pergaminho);
        bolsaGenerica.adiconarEquipamento(shuriken);
        bolsaGenerica.adiconarEquipamento(bombaDeFumaca);

        System.out.println(bolsaGenerica);*/

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();

        bolsaNinja.adiconarFerramenta(new Kunai("Ferro"));
        bolsaNinja.adiconarFerramenta(new Shuriken(2));
        bolsaNinja.adiconarFerramenta(new Pergaminho("justsu de tranfomacao nivel S"));

        bolsaNinja.mostrarFerramenta();
        System.out.println(bolsaNinja);

    }
}
