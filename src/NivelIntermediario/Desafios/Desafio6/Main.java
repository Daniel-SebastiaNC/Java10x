package NivelIntermediario.Desafios.Desafio6;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //Iniciar Lista de Ninjas
        LinkedList<Ninja> listDeNinjas = new LinkedList<>();

        listDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Temari", 18, "Areia"));

        //Listar ninjas
        System.out.println("-------------Lista Inicial-------------");
        listDeNinjas.stream().forEach(System.out::println);
        System.out.println("---------------------------------------");

        //Adiconar ao Início da lista
        //listDeNinjas.add(0, new Ninja("Tobirama Senju", 58, "Konoha"));
        System.out.println("--------Lista Adicona no inicio--------");
        listDeNinjas.addFirst(new Ninja("Tobirama Senju", 58, "Konoha"));
        listDeNinjas.stream().forEach(System.out::println);
        System.out.println("---------------------------------------");

        //Remover do início
        //listDeNinjas.remove(0);
        Ninja ninjaRemovido =  listDeNinjas.removeFirst();
        System.out.println("Ninja removido: " + ninjaRemovido);
        System.out.println("---------------------------------------");
        System.out.println("--------Lista Remove no inicio---------");
        listDeNinjas.stream().forEach(System.out::println);
        System.out.println("---------------------------------------");

        //Procura Ninja por index
        Ninja ninjaEscolhido = listDeNinjas.get(4);
        System.out.println("Ninja escolhido: " + ninjaEscolhido);
    }
}
