package exercicio17;

public class Animal {
    public String especie;
    public Integer idade;
    public Double peso;

    public Animal(String especie, Integer idade, double peso) {
        this.especie = especie;
        this.idade = idade;
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
