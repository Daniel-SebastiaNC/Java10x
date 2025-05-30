package java10x.NivelFacil.Condicoes;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Escolha o ninja:
                1- Naruto
                2- Sasuke
                3- Sakura
                """ );

        String escolha = scanner.nextLine();

        switch (escolha){
            case "Naruto":
                System.out.println("7º Hokage");
                break;
            case "Sasuke":
                System.out.println("Hokage das sombras");
                break;
            case "Sakura":
                System.out.println("Melhor kunoshi");
                break;
            default:
                System.out.println("Opção Inválida");
        }

        scanner.close();
    }
}
