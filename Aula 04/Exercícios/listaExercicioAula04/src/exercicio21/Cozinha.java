package exercicio21;

public class Cozinha {
    private Integer quantidadePessoas;
    private String cor;

    public Cozinha(Integer quantidadePessoas, String cor) {
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public Integer getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public String getCor() {
        return cor;
    }

    public void Cozinhar(String comida){
        System.out.println("Cozinhando um belo prato de: " + comida);
    }

    public void limpar(String comida){
        System.out.println("Limpando a bagunça causada pelo prato de: " + comida);
    }

    @Override
    public String toString() {
        return "quantidade de pessoas: " + quantidadePessoas + " cor " + cor;
    }
}

