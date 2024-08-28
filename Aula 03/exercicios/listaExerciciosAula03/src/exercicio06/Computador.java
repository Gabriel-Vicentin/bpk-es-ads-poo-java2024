package exercicio06;

public class Computador {
    private String processador;
    private Integer memoriaRAM;
    private final Integer armazenamento;


    public Computador(String processador, Integer memoriaRAM, Integer armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }

    public String getProcessador() {
        return processador;
    }

    public Integer getMemoriaRAM() {
        return memoriaRAM;
    }

    public Integer getArmazenamento() {
        return armazenamento;
    }

    public void ligar(){
        System.out.println("Ligando....");
    }

    public void desligar(){
        System.out.println("Desligando....");
    }

    @Override
    public String toString() {
        return "Meu computador tem um processador: " + processador + " Com " + memoriaRAM + "GB de ram e " + armazenamento + "TB de armazenamento";
    }
}
