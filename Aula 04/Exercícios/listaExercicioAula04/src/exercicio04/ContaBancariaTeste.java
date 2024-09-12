package exercicio04;

public class ContaBancariaTeste {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1000, 5000);

        System.out.println(conta1);
        conta1.sacar(500);
        System.out.println(conta1);
        conta1.depositar(2000);
        System.out.println(conta1);
    }
}
