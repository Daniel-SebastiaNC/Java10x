package java10x.NivelFacil.Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int choose = 0;
        final int MAX_NNINJA = 2;
        String[] listNinja = new String[MAX_NNINJA];


        String name;

        while (choose != 3){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Remover Ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose){
                case 1:
                    if (count < MAX_NNINJA) {
                        System.out.println("Nome do Ninja: ");
                        name = scanner.nextLine();

                        listNinja[count] = name;

                        System.out.println("Cadastrado com Sucesso!");
                        count++;
                    } else {
                        System.out.println("Não há espaço na lista!");
                    }

                    break;
                case 2:
                    if (count == 0){
                        System.out.println("Lista Vazia!");
                    }
                    else {
                        for (int i = 0; i < listNinja.length; i++) {
                            System.out.println("Ninja " +(i + 1) + ": " + listNinja[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        }
        scanner.close();
    }
}
