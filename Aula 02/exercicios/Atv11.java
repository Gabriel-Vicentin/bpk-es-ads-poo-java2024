import java.util.Scanner;

public class Atv11 {
    public static void main(String[] args) {
        Integer number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra para identificar se é um palindromo ");
        String palavra = scanner.nextLine();

        String palavraformatada = palavra.toLowerCase();

        String palavrainvertida = new StringBuilder(palavraformatada).reverse().toString();

        if (palavraformatada.equals(palavrainvertida)){
            System.out.println("A palavra " + palavra + " é um palindromo");
        }else {
            System.out.println(("A palavra " + palavra + " não é um palindromo"));
        }
    }
}

