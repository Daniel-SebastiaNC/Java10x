package NivelAvancado.Streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ninja> ninjaList = new ArrayList<>();

        ninjaList.add(new Ninja("Naruto UzumaKI", "Folha",16 ));
        ninjaList.add(new Ninja("Sasuke Uchiha", "Folha",17 ));
        ninjaList.add(new Ninja("Sakura Haruno", "Folha",16 ));
        ninjaList.add(new Ninja("Gaara", "Vento",16 ));
        ninjaList.add(new Ninja("Temari", "Vento",17 ));
        ninjaList.add(new Ninja("Killer Bee", "Raio",19 ));



        //Filter
        System.out.println("=================================================");
        ninjaList.stream()
                .filter(ninja -> ninja.getAldeia().equals("Folha"))
                .forEach(System.out::println);

        //Sorted by idade
        System.out.println("=================================================");
        ninjaList.stream()
                .sorted((n1, n2) -> Integer.compare(n1.getIdade(),n2.getIdade()))
                .forEach(System.out::println);

        //Sorted by nome
        System.out.println("=================================================");
        ninjaList.stream()
                .sorted((n1, n2) -> n1.getNome().compareTo(n2.getNome()))
                .forEach(System.out::println);

        //MAP
        System.out.println("=================================================");
        ninjaList.stream()
                .map(Ninja::getNome)
                .forEach(System.out::println);

        //Max
        System.out.println("=================================================");
        Ninja ninjaMaisVelho = ninjaList.stream()
                .max((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .orElse(null);

        System.out.println(ninjaMaisVelho);

        //Min
        System.out.println("=================================================");

        Ninja ninjaMaisNovo = ninjaList.stream()
                .min((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .orElse(null);

        System.out.println(ninjaMaisNovo);
    }
}
