package exercicio10;

public class Veiculo {
    private String tipo;
    private String cor;
    private String placa;

    public Veiculo(String tipo, String cor, String placa) {
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void abastecer(int valor){
        System.out.println("Abastecendo: " + valor + "L");
    }

    public void lavar(){
        System.out.println("Lavando o carro...");
    }

    @Override
    public String toString() {
        return "Veiculo " + tipo + " cor: " + cor + " placa: " + placa;
    }
}
