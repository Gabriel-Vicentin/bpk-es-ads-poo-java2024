package AtividadeLivros;

public class Pagina {
    private Integer numero;
    private String conteudo;


    public Pagina(Integer numero, String conteudo) {
        this.numero = numero;
        this.conteudo = conteudo;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getConteudo() {
        return conteudo;
    }
}

