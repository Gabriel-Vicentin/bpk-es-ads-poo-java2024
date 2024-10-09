package AtividadeCarro;

public class Motor {
    private String modelo;
    private int potencia;
    private int cilindradas;
    private boolean ligado = false;
    private int rpm;
    private TipoCombustivel tipoCombustivel;

    public Motor(String modelo, int potencia, int cilindradas, boolean ligado, int rpm, TipoCombustivel tipoCombustivel) {
        this.modelo = modelo;
        this.potencia = potencia;
        this.cilindradas = cilindradas;
        this.ligado = ligado;
        this.rpm = rpm;
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getRpm() {
        return rpm;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void ligar(){
        System.out.println("Ligando o motor...");
        ligado = true;
        rpm = 1000;
    }

    public void desligar(){
        System.out.println("Desligando o motor...");
        ligado = false;
        rpm = 0;
    }

    public void aumentarPotencia(int valor){
        System.out.println("Incrementando potencia...");
        potencia += valor;
        System.out.println("Potencia atual " + potencia);
    }

    public void reduzirPotencia(int valor){
        System.out.println("Reduzindo potencia...");
        potencia -= valor;
        System.out.println("Potencia atual: " + potencia);
    }

    public void acelerar(int incrementorpm){
        if (ligado){
            System.out.println("Incrementando rpm... ");
            rpm += incrementorpm;
            System.out.println("RPM atual: " + rpm);
        } else {
            System.out.println("O motor desta desligado");
        }
    }

    public void reduzirRpm(int decrementoRpm){
        if (ligado && decrementoRpm <= rpm){
            System.out.println("Diminuindo RPM...");
            rpm -= decrementoRpm;
            System.out.println("Rpm atual: " + rpm);
        } else {
            System.out.println("O motor desta desligado ou o valor a ser decrementado é maior que o valor atual");
        }
    }

    @Override
    public String toString() {
        return "AtividadeCarro.Motor{" +
                "modelo='" + modelo + '\'' +
                ", potencia=" + potencia +
                ", cilindradas=" + cilindradas +
                ", ligado=" + ligado +
                ", rpm=" + rpm +
                '}';
    }
}
