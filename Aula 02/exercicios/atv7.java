import java.util.Scanner;


public class atv7 {
    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero para a soma");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero para a soma");
        int num2 = scanner.nextInt();

        int result = soma(num1, num2);
        System.out.println("O resultado da soma de " + num1 + " e " + num2 + " equivale a: " + result);
    }
}
