package exercicio11;

public class teste {
    public static void main(String[] args) {
        Cidade palotina = new Cidade("Palotina", 30000, "Parana");

        System.out.println(palotina);

        palotina.aumentarPopulacao(50000);
        palotina.diminuirPopulacao(10000);
    }
}
