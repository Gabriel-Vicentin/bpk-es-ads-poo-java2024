package exercicio17;

public class Animal {
    private String especie;
    private Integer idade;
    private Double peso;

    public Animal(String especie, Integer idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void alimentar(){
        System.out.println("Alimentando o " + especie);
    }


    public void dormir() {
        System.out.println("fazendo o " + especie + " tirar uma soneca");
    }

    @Override
    public String toString() {
        return "especie: " + especie + " idade: " + idade + " anos "  + peso + "KG";
    }
}
