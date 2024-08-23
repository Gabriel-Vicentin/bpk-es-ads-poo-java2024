import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero para um cauculo");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero para um cauculo");
        int num2 = scanner.nextInt();


        System.out.println("Adicao: " + (num1 + num2));
        System.out.println("Subtracao: " + (num1 - num2));
        System.out.println("multiplicacao: " + num1 * num2);
        System.out.println("Divisao: " + num1 / num2);

    }
}
