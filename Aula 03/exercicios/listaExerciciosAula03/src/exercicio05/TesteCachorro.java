package exercicio05;

public class TesteCachorro {
    public static void main(String[] args) {
        Cachorro pastor = new Cachorro("Buddy", "Pastor Alemão", 4);

        System.out.println(pastor);
        pastor.latir();
        pastor.correr();
    }
}
