package exercicio06;

public class teste {
    public static void main(String[] args) {
        Computador meucomputador = new Computador("Intel 8 geração", 8, 2);
        System.out.println(meucomputador);
        meucomputador.ligar();
        meucomputador.desligar();
    }
}
