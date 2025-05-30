package NivelFacil.Condicoes;

public class Condicoes {
    public static void main(String[] args) {
        String nome = "Naruto Uzumaki";
        int idade = 14;
        boolean hokage = false;
        short numMissao = 10;

        System.out.println(numMissao >= 10 && idade >= 15 ? "Passou de nível" : "Não completou o número mínimo de missões");
        /*
        if (numMissao >= 10 && idade >= 15) {
            System.out.println("Passou de nível");
        } else{
            System.out.println("Não completou o número mínimo de missões");
        }*/
    }
}
