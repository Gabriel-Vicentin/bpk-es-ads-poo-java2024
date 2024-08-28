package exercicio12;

public class Filme {
    public String titulo;
    public String diretor;
    public Double duracao;

    public Filme(String titulo, String diretor, Double duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public void iniciarFilme(){
        System.out.println("Iniciando...");
    }

    public void pararFilme(){
        System.out.println("Pausando...");
    }

    @Override
    public String toString() {
        return "Filme " + titulo + " Diretor: " + diretor + " duração: " + duracao + "H";
    }
}
