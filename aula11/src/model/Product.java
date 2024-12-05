package model;

public record Product(String name, int weight, int value) {
    @Override
    public String toString() {
        return String.format("Produto: %s | Peso: %d | Valor: %d", name, weight, value);
    }
}
