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

    public void sacar(){
        System.out.println("O saldo atual equivle a: " + saldo + " Deseja sacar qual valor?");
        Integer valor = scanner.nextInt();
        saldo -= valor;
        System.out.println("Valor após o saque: " + saldo);
    }

    public void depositar (){
        System.out.println("O saldo atual equivale a: " + saldo + " Deseja depositar? qual valor?");
        Integer valor = scanner.nextInt();
        saldo += valor;
        System.out.println("Valor após o Deposito: " + saldo);
    }

    @Override
    public String toString() {
        return "Conta bancaria: Nº" + numeroConta + " Saldo: " + saldo;
    }
}


