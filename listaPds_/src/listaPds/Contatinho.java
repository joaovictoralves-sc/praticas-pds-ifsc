package listaPds;

public class Contatinho {
    private String nome;
    private String email;
    private String telefone;
    private String categoria;

    public Contatinho(String nome, String email, String telefone, String categoria) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + "#" + email + "#" + telefone + "#" + categoria;
    }
}
