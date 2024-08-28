package exercicio04;

public class teste {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1000, 5000);

        System.out.println(conta1);
        conta1.sacar();
        System.out.println(conta1);
        conta1.depositar();
        System.out.println(conta1);
    }
}
