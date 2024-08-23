import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Atv12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Digite cinco numeros para serem ordenados");
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + "º Numero");
             num[i] = scanner.nextInt();
        }

        Arrays.sort(num);
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }

    }
}

