package exercicio16;

public class TesteLoja {
    public static void main(String[] args) {
        Loja loja1 = new Loja("Jose carros", "R. Flamboyant, palotina", "(44) 998030-4912");

        System.out.println(loja1);

        loja1.abrirLoja();

        loja1.fecharLoja();
    }
}
