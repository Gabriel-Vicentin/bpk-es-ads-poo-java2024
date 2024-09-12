package exercicio09;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidadeEstoque;

    public Produto(String nome, Double preco, Integer quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void aumentarEstoque(int valor){
        quantidadeEstoque += valor;
       System.out.println("A quantidade de produtos no estoque aumentou para: " + quantidadeEstoque);
   }

    public void diminuirEstoque(int valor){
        quantidadeEstoque -= valor;
        System.out.println("A quantidade de produtos no estoque diminuiu para: " + quantidadeEstoque);
    }

    @Override
    public String toString() {
        return "Produto " + nome + "" + "R$ " + preco + " Quantidade em estoque: " + quantidadeEstoque;
    }
}


