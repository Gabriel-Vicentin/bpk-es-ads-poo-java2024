package exercicio09;

public class executavel {
    public static void main(String[] args) {
        Produto produto1 = new Produto("banana", 20.50, 20);

        System.out.println(produto1);

        produto1.aumentarEstoque(50);
        produto1.diminuirEstoque(20);
    }
}
