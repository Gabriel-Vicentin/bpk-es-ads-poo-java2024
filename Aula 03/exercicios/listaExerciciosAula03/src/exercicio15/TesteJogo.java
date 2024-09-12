package exercicio15;

public class TesteJogo {
    public static void main(String[] args) {
        Jogo jogo1 = new Jogo("Terraria", "Aventura", 20.50);

        System.out.println(jogo1);

        jogo1.iniciarJogo();

        jogo1.pausarJogo();

        jogo1.iniciarJogo();
    }
}
