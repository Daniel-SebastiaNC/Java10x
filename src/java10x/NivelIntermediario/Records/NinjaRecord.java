package NivelIntermediario.Records;

public record NinjaRecord(String nome, String email, int telefone) {

    //Tudo vai ser FINAL

    public String nomeUpperCase(){
        return nome.toUpperCase();
    }
}

