package exercicio14;

public class Time {
        public String nome;
        public String tecnico;
        public Integer numeroDeJogadores;

        public Time(String nome, String tecnico, Integer numeroDeJogadores) {
            this.nome = nome;
            this.tecnico = tecnico;
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

