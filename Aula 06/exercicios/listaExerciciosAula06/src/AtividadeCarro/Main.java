package AtividadeCarro;

public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor("abc", 500, 200, true, 100, TipoCombustivel.GASOLINA);
        Carro carro1 = new Carro("BMW", motor1);

        carro1.ligarCarro();
        carro1.turboBoost(500);
        carro1.acionarAcelerador(50);
        carro1.acionarFreio(60);
    }
}
