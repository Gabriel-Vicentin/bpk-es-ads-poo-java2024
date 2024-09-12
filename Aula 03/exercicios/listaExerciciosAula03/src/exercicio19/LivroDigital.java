package exercicio19;

public class LivroDigital {
    private String titulo;
    private String autor;
    private Double tamanhoArquivo;

    public LivroDigital(String titulo, String autor, Double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTamanhoArquivo(Double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public void abrirPagina(int valor){
        System.out.println("Abrindo na pag: " + valor);
    }


    public void fecharLivro() {
        System.out.println("Fechando o livro...");
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + " autor: " + autor + " Tamanho do arquivo" + tamanhoArquivo + "MB";
    }
}
