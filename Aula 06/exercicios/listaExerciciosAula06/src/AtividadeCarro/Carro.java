package AtividadeCarro;

public class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }


    public void ligarCarro(){
        motor.ligar();
    }

    public void desligarCarro(){
        motor.desligar();
    }

    public void turboBoost(int valor){
        motor.aumentarPotencia(valor);
    }

    public void reduzirPotenciaMotor(int resp){
        motor.reduzirPotencia(resp);
    }

    public void acionarFreio(int resp){
        motor.reduzirRpm(resp);
    }

    public void acionarAcelerador(int resp){
        motor.acelerar(resp);
    }
}

