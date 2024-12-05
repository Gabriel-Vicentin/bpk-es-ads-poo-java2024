package Atividade02;

abstract class Conta {
    protected String titular;
    protected Double saldo;

    public Conta(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void debitar(){
        System.out.println("Debitando");
    }

    public void creditar(){
        System.out.println("Creditar");
    }

}


