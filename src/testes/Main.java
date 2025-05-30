package testes;

import java10x.NivelAvancado.Streams.Ninja;

import java.util.Random;

public class Main {
    private static Random generate = new Random();

    public static void main(String[] args) {
        Ninja ninja = new Ninja("Naruto", "folha", 12);
        System.out.println(ninja);
        mudarNumero(ninja);
        System.out.println(ninja);
    }

    private static void mudarNumero(Ninja ninja) {
        ninja.setIdade(-ninja.getIdade());
    }
}
