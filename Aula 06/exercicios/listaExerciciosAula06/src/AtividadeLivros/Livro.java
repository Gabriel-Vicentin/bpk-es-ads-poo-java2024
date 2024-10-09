package AtividadeLivros;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private String autor;
    private List<Pagina> paginas;

    public Livro(String titulo, String autor, Pagina pagina) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = new ArrayList<>(pagina);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Pagina getPagina() {
        return pagina;
    }


    public void adicionarpagina(){

    }
}
