import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor para identificar se é um numero primo: ");
        int num1 = scanner.nextInt();
        scanner.close();

        if (num1 <= 1) {
            System.out.println("O valor não é um número primo");
            return;
        }

        for (int i = 2; i < num1; i++) {
            if (num1 % i == 0) {
                System.out.println("O valor nao é um número primo");
                return;
            }
        }
        System.out.println("O valor é um número primo");
    }
}
