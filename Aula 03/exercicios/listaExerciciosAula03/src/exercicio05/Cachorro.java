package exercicio05;

public class Cachorro {
    public String nome;
    public String raca;
    public Integer idade;

    public Cachorro(String nome, String raca, Integer idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void latir (){
        System.out.println(("Au au au"));
    }

    public void correr (){
        System.out.println("Velocidade atual: 999Km/h");
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " raça: " + raca + " idade: " + idade + " Anos";
    }
}
