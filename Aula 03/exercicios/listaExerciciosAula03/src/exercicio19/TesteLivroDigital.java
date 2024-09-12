package exercicio19;

public class TesteLivroDigital {
    public static void main(String[] args) {
        LivroDigital livroDigital1 =  new LivroDigital("One piece", "Oda", 5000.0);

        System.out.println(livroDigital1);

        livroDigital1.abrirPagina(50);

        livroDigital1.fecharLivro();
    }
}
