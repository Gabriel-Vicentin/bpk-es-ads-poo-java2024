import java.util.Scanner;

public class Atv9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor para um calculo: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo valor para um calculo: ");
        double num2 = scanner.nextDouble();
        System.out.println("Qual operação deseja realizar?");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int esc = scanner.nextInt();

        switch (esc){
            case 1:
                System.out.println((num1 + num2));
                break;

            case 2:
                System.out.println(num1 - num2);
                break;

            case 3:
                System.out.println(num1 * num2);
                break;

            case 4:
                System.out.println(num1 / num2 );
        }
    }
}
