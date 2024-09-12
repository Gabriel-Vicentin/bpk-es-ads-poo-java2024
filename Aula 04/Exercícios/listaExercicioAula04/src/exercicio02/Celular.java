package exercicio02;

/**
 * 2 - Defina uma classe Celular com atributos como marca, modelo,
 * e capacidadeBateria.
 * Adicione métodos para ligar e desligar o celular.
 */
public class Celular {
    private String marca;
    private String modelo;
    private String capacidadeBateria;
    private Boolean ligado = false;

    public Celular(String marca, String modelo, String capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void ligar(boolean teste) {
        if (ligado) {
            System.out.println("O celular esta ligado");
        } else {
            System.out.println("O celular esta desligado, ligando...");
            this.ligado = true;
        }

    }

    public void desligar(boolean teste) {
        if (ligado == teste) {
            System.out.println("O celular esta ligado, Desligando...");
        } else {
            System.out.println("O celular esta desligado.");
            this.ligado = false;
        }
    }


    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadeBateria='" + capacidadeBateria + '\'' +
                ", ligado=" + ligado +
                '}';
    }
}
