package Atividade01;

public class Caminhao extends Veiculo{

    public Caminhao(String marca, String modelo, Integer ano) {
        super(marca, modelo, ano);
    }

    public void carregarCarga(){
        System.out.println("Carregando carga");
    }
}
