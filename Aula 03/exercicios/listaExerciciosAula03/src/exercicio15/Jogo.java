package exercicio15;

public class Jogo {
    private String nome;
    private String genero;
    private Double preco;

    public Jogo(String nome, String genero, Double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void iniciarJogo(){
        System.out.println("Dando Play...");
    }

    public void pausarJogo() {
        System.out.println("Pausando...");
    }

    @Override
    public String toString() {
        return "Jogo " + nome + " genero: " + genero + " preço: " + preco + "R$";
    }
}
