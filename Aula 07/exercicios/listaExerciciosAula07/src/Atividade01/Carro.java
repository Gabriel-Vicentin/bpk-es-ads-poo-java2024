package Atividade01;

public class Carro extends Veiculo {

    public Carro(String marca, String modelo, Integer ano) {
        super(marca, modelo, ano);
    }

    public void abrirPorta(){
        System.out.println("Abrindo porta...");
    }
}
