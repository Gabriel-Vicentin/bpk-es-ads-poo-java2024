package exercicio22;

public class Empresa {
    private String nome;
    private String cnpj;
    private Integer numeroFuncionarios;

    public Empresa(String nome, String cnpj, Integer numeroFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void contratarFuncionarios(int contratados){
        numeroFuncionarios += contratados;
        System.out.println("Numero atual de funcionarios depois da contratação: " + numeroFuncionarios);
    }

    public void demitirFuncionarios(int contratados){
        numeroFuncionarios -= contratados;
        System.out.println("Numero atual de funcionarios depois da demissão: " + numeroFuncionarios);
    }

    @Override
    public String toString() {
        return "nome da empresa: " + nome + " CNPJ: " + cnpj + " NumeroFuncionarios: " + numeroFuncionarios;
    }
}


