import java.util.Random;
import java.util.Scanner;

public class Atv13 {
    public static void main(String[] args) {
        int tentativas = 0;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = rand.nextInt(100);
        n += 1;
        System.out.println(n);

        int adv;
        do {
            System.out.println("Tente adivinhar um numero aleatorio de 1 a 100");
            adv = scanner.nextInt();
            if (adv < n) {
                System.out.println("O numero a ser adivinha é maior do que o digitado");
            } else if (adv > n){
                System.out.println("O numero a ser adivinhado é menor do que o digitado");
            } else {
                System.out.println("Voce adivinhou o numero");
            }
            tentativas++;
        } while (adv != n);
        System.out.println("O numero de tentativas necessario foi: " + tentativas + " tentativas");
    }
}
