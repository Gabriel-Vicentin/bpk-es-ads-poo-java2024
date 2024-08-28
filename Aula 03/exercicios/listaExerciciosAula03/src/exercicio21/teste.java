package exercicio21;

public class teste {
    public static void main(String[] args) {
        Cozinha cozinha1 = new Cozinha(15, "Azul");

        System.out.println(cozinha1);
        String comida = "Lasanha";

        cozinha1.Cozinhar(comida);
        cozinha1.limpar(comida);
    }
}
