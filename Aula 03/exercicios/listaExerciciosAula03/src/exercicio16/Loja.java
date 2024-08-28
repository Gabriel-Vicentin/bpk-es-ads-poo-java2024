package exercicio16;

import java.math.BigInteger;

public class Loja {
    public String nome;
    public String endereco;
    public String telefone;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
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
