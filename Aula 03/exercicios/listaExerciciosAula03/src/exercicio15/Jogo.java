package exercicio15;

public class Jogo {
    public String nome;
    public String genero;
    public Double preco;

    public Jogo(String nome, String genero, Double preco) {
        this.nome = nome;
        this.genero = genero;
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
