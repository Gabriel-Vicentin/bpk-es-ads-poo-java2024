package exercicio03;

public class Pessoa {
    public String nome;
    public Integer idade;
    public Double altura;


    public Pessoa(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public String toString() {
        if (nome != null && idade != null && altura != null) {
            return "Eu sou o " + nome + " tenho " + idade + " anos e " + altura + "m de altura";
        } else {
            return "Atributos invalidos";
        }
    }
}