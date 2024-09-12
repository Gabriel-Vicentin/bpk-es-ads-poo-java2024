package exercicio17;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("leão", 7, 100);
        System.out.println(animal1);

        animal1.alimentar();

        animal1.dormir();
    }
}
