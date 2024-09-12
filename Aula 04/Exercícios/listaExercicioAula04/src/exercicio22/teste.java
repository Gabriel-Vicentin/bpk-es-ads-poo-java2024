package exercicio22;

public class teste {
    public static void main(String[] args) {
        Empresa empresa1 =  new Empresa("gonzales ltda", "70.100.663/0001-63", 50);

        System.out.println(empresa1);

        empresa1.contratarFuncionarios(15);
        empresa1.demitirFuncionarios(30);


    }
}
