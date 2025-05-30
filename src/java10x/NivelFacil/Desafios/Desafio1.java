package java10x.NivelFacil.Desafios;

public class Desafio1 {
    public static void main(String[] args) {
        //Ninja1
        String nomeNinja1 = "Naruto";
        int idadeNinja1 = 14;
        String missaoNomeNinja1 = "Buscar Sasuke";
        char nivelMissaoNinja1 = 'A';
        String statusMissaoNinja1 = "Não concluída";

        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idadeNinja1 + " anos");
        System.out.println("Participou da missao: " + missaoNomeNinja1);
        System.out.println("Nível da da missão: " + nivelMissaoNinja1);
        System.out.println("Status missão: " + statusMissaoNinja1);

        System.out.println("------------------------------------");

        if ((idadeNinja1 < 15) && (nivelMissaoNinja1 == 'B' || nivelMissaoNinja1 == 'A' || nivelMissaoNinja1 == 'S')) {
            System.out.println("O ninja não pode concluir a missão!");
        } else {
            statusMissaoNinja1 = "concluída";
            System.out.println("Ninja conseguiu concluir a missão!");
        }
        System.out.println("Status missão: " + statusMissaoNinja1);

        System.out.println("=========================================");

        //Ninja2
        String nomeNinja2 = "Sakura";
        int idadeNinja2 = 16;
        String missaoNomeNinja2 = "Resgatar Gaara";
        char nivelMissaoNinja2 = 'S';
        String statusMissaoNinja2 = "Não concluída";

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idadeNinja2 + " anos");
        System.out.println("Participou da missao: " + missaoNomeNinja2);
        System.out.println("Nível da da missão: " + nivelMissaoNinja2);
        System.out.println("Status missão: " + statusMissaoNinja2);

        System.out.println("------------------------------------");

        if ((idadeNinja2 < 15) && (nivelMissaoNinja2 == 'B' || nivelMissaoNinja2 == 'A' || nivelMissaoNinja2 == 'S')) {
            System.out.println("O ninja não pode concluir a missão!");
        } else {
            statusMissaoNinja2 = "concluída";
            System.out.println("Ninja conseguiu concluir a missão!");
        }
        System.out.println("Status missão: " + statusMissaoNinja2);

        System.out.println("=========================================");

        //Ninja3
        String nomeNinja3 = "Shikamaru";
        int idadeNinja3 = 16;
        String missaoNomeNinja3 = "Vingar Sensei";
        char nivelMissaoNinja3 = 'S';
        String statusMissaoNinja3 = "Não concluída";

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idadeNinja3 + " anos");
        System.out.println("Participou da missao: " + missaoNomeNinja3);
        System.out.println("Nível da da missão: " + nivelMissaoNinja3);
        System.out.println("Status missão: " + statusMissaoNinja3);

        System.out.println("------------------------------------");

        if ((idadeNinja3 < 15) && (nivelMissaoNinja3 == 'B' || nivelMissaoNinja3 == 'A' || nivelMissaoNinja3 == 'S')) {
            System.out.println("O ninja não pode concluir a missão!");
        } else {
            statusMissaoNinja3 = "concluída";
            System.out.println("Ninja conseguiu concluir a missão!");
        }
        System.out.println("Status missão: " + statusMissaoNinja3);

        System.out.println("=========================================");
    }
}
