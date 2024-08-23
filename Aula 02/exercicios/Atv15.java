import java.util.Scanner;

public class Atv15 {
    public static int recursao(int num) {
        if (num <= 1){
            return 1;
        }else return (num * recursao(num - 1));

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 1;

        System.out.println("Digite um número para verificar o seu fatorial");
        int num = scanner.nextInt();
         recursao(num);

       for (int i = num; i > 0; i--) {
           result *= i;
       }

        System.out.println("Loop for:");
        System.out.println("O fatorial de " + num + "! equivale a: " + result);

         System.out.println("Recursão");
         System.out.println("O fatorial de " + num + "! equivale a: " + recursao(num));
    }
}


