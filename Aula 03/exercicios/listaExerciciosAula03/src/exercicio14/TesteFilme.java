package exercicio14;

public class TesteFilme {
    public static void main(String[] args) {
        Time time1 = new Time("Santos", "Cuca", 16);

        System.out.println(time1);

        time1.adicionarJogador(5);
        time1.removerJogador(3);
    }
}
