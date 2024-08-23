import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero para verificar se e impar ou par");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println("O numero " + num + " e par");
        }else{
            System.out.println("O numero " + num + " e impar");
        }
    }
}
