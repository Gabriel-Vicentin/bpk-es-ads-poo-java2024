package exercicio03;

public class Pessoa {
    private String nome;
    private Integer idade;
    private Double altura;


    public Pessoa(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setAltura(Double altura) {
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