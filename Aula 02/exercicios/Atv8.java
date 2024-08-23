import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Bem vindo: " + nome);
        System.out.println("Idade: " + idade);


    }
}
