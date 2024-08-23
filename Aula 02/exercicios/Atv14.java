import java.util.Arrays;
import java.util.Scanner;

public class Atv14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        int contagem = 0;

        System.out.println("Digite uma palavra para contar seu numero de vogais");
        String palavra = scanner.nextLine();
        String palavraformatada = palavra.toLowerCase();
        scanner.close();

        for (int i = 0; i < palavraformatada.length(); i++) {
            char letra = palavraformatada.charAt(i);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contagem++;
            }
        }
        System.out.println("A palavra: " + palavra + " contem " + contagem + "ª Vogais");
    }
}
