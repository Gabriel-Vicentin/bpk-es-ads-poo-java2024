package exercicio04;

import java.util.Scanner;

public class ContaBancaria {
    Scanner scanner = new Scanner(System.in);
    public Integer numeroConta;
    public Integer saldo;

    public ContaBancaria(Integer numeroConta, Integer saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void sacar(Integer saldo){
        if(saldo > 0) {
            System.out.println("O saldo atual equivle a: " + saldo + " Deseja sacar qual valor?");
            Integer valor = scanner.nextInt();
            if (valor > 0) {
                saldo -= valor;
                System.out.println("Valor após o saque: " + saldo);
            } else {
                System.out.println("Valor de saque desejado invalido");
            }
        }else {
            System.out.println("Saldo negativo, impossivel realizar saque");
        }
    }

    public void depositar (Integer saldo){
        System.out.println("O saldo atual equivale a: " + saldo + " Deseja depositar? qual valor?");
        Integer valor = scanner.nextInt();
        if (valor > 0) {
            saldo += valor;
            System.out.println("Valor após o Deposito: " + saldo);
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "scanner=" + scanner +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}


