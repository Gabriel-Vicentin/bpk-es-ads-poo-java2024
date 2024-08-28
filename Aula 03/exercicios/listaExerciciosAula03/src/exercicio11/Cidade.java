package exercicio11;

public class Cidade {
    public String nome;
    public Integer populacao;
    public String estado;

    public Cidade(String nome, Integer populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentarPopulacao(int valor){
        populacao += valor;
        System.out.println("Novo numero da população: " + populacao);
    }

    public void diminuirPopulacao(int valor){
        populacao -= valor;
        System.out.println("Novo numero da população: " + populacao);
    }

    @Override
    public String toString() {
        return "Cidade " + nome + " populacao: " + populacao + " estado: " + estado;
    }
}


