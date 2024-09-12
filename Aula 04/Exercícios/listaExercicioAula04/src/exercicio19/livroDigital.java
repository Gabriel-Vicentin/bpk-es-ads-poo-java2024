package exercicio19;

public class livroDigital {
    public String titulo;
    public String autor;
    public Double tamanhoArquivo;

    public livroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
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
