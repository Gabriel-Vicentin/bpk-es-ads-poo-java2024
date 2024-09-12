package exercicio12;

public class Filme {
    private String titulo;
    private String diretor;
    private Double duracao;

    public Filme(String titulo, String diretor, Double duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setDuracao(Double duracao) {
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
