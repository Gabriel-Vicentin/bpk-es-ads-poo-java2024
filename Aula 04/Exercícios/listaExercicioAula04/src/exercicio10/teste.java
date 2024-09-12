package exercicio10;

public class teste {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("BMW", "Vermelha","CYZ2412");

        System.out.println(carro1);

        carro1.abastecer(100);

        carro1.lavar();
    }
}
