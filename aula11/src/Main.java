import model.Product;
import model.KnapsackOptimizer;
import model.ReportGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.println("=== Sistema de Otimização de Estoque ===");

        // Entrada de Produtos
        while (true) {
            System.out.print("\n1. Adicionar produto\n2. Finalizar cadastro\nEscolha uma opção: ");
            int option = Integer.parseInt(scanner.nextLine());

            if (option == 1) {
                System.out.print("Nome do produto: ");
                String name = scanner.nextLine();
                System.out.print("Peso do produto: ");
                int weight = Integer.parseInt(scanner.nextLine());
                System.out.print("Valor do produto: ");
                int value = Integer.parseInt(scanner.nextLine());

                products.add(new Product(name, weight, value));
            } else if (option == 2) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        // Definir Capacidade do Estoque
        System.out.print("\nCapacidade máxima do armazenamento: ");
        int capacity = Integer.parseInt(scanner.nextLine());

        // Executar Otimização
        List<Product> selectedProducts = KnapsackOptimizer.optimize(products, capacity);

        // Gerar Relatório
        ReportGenerator.generate(products, selectedProducts, capacity);
    }
}
