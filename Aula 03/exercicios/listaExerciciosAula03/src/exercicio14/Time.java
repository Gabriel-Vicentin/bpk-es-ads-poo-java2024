package exercicio14;

public class Time {
        private String nome;
        private String tecnico;
        private Integer numeroDeJogadores;

        public Time(String nome, String tecnico, Integer numeroDeJogadores) {
            this.nome = nome;
            this.tecnico = tecnico;
            this.numeroDeJogadores = numeroDeJogadores;
        }

        public String getNome() {
            return nome;
        }

        public String getTecnico() {
            return tecnico;
        }

        public Integer getNumeroDeJogadores() {
            return numeroDeJogadores;
        }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public void setNumeroDeJogadores(Integer numeroDeJogadores) {
        this.numeroDeJogadores = numeroDeJogadores;
    }

    public void adicionarJogador(int valor){
            numeroDeJogadores += valor;
            System.out.println("Novo numero de jogadores: " + numeroDeJogadores);
        }


        public void removerJogador(int valor) {
            numeroDeJogadores -= valor;
            System.out.println("Novo numero de jogadores: " + numeroDeJogadores);
        }

        @Override
        public String toString() {
            return "Time " + nome + " Tecnico: " + tecnico + " Numero de jogadores: " + numeroDeJogadores;
        }
}

