package exercicio12;

public class TesteFilme {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Carros", "John Lennon", 2.30);

        System.out.println(filme1);

        filme1.iniciarFilme();
        filme1.pararFilme();
    }
}
