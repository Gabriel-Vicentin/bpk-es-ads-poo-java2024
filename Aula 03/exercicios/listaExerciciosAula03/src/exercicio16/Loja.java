package exercicio16;

import java.math.BigInteger;

public class Loja {
    private String nome;
    private String endereco;
    private String telefone;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void abrirLoja(){
        System.out.println("Abrindo a loja para os clientes");
    }

    public void fecharLoja() {
        System.out.println("Fechando a loja...");
    }

    @Override
    public String toString() {
        return "Loja: " + nome + " endereço: " + endereco + " telefone: " + telefone;
    }
}
