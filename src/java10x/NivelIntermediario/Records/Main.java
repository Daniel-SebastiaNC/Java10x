package java10x.NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {
        Ninja naruto = new Ninja("Naruto", "naruto@email.com", 99999999);
        System.out.println(naruto);

        NinjaRecord sasuke = new NinjaRecord("Sasuke", "sasuke@email.com", 8888888);
        System.out.println(sasuke);
    }
}
