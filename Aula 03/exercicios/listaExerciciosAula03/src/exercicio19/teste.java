package exercicio19;

public class teste {
    public static void main(String[] args) {
        livroDigital livroDigital1 =  new livroDigital("One piece", "Oda", 5000);

        System.out.println(livroDigital1);

        livroDigital1.abrirPagina(50);

        livroDigital1.fecharLivro();
    }
}
