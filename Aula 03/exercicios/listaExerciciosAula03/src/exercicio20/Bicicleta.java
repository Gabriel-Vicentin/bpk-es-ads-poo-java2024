package exercicio20;

public class Bicicleta {
        private String marca;
        private String modelo;
        private int tamanhoRoda;

        public Bicicleta(String marca, String modelo, int tamanhoRoda) {
            this.marca = marca;
            this.modelo = modelo;
            this.tamanhoRoda = tamanhoRoda;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public int getTamanhoRoda() {
            return tamanhoRoda;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public void setTamanhoRoda(int tamanhoRoda) {
            this.tamanhoRoda = tamanhoRoda;
        }

    public void pedalar() {
        System.out.println("Você está pedalando a bicicleta " + marca + " " + modelo + ".");
    }

    public void frear() {
        System.out.println("Você freou a bicicleta " + marca + " " + modelo + ".");
    }
}
