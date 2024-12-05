package model;

import java.util.List;

public class ReportGenerator {

    //Geramos uma list que contem todos os produtos cadastrados
    public static void generate(List<Product> allProducts, List<Product> selectedProducts, int capacity) {

        System.out.println("\n=== Relatorio ===");

        // Resumo da otimização
        int totalWeight = 0;
        int totalValue = 0;

        for (Product product : selectedProducts) {
            totalWeight += product.weight();
            totalValue += product.value();
        }

        System.out.println("Capacidade máxima: " + capacity);
        System.out.println("Peso total usado: " + totalWeight);
        System.out.println("Valor total acumulado: " + totalValue);

        // Produtos selecionados
        System.out.println("\nProdutos Selecionados:");
        if (selectedProducts.isEmpty()) {
            System.out.println("- Nenhum produto foi selecionado.");
        } else {
            for (Product product : selectedProducts) {
                System.out.println("- " + product);
            }
        }

        // Produtos não selecionados
        System.out.println("\nProdutos Não Selecionados:");
        boolean anyNotSelected = false;
        for (Product product : allProducts) {
            if (!selectedProducts.contains(product)) {
                System.out.println("- " + product);
                anyNotSelected = true;
            }
        }
        if (!anyNotSelected) {
            System.out.println("- Todos os produtos foram selecionados.");
        }

        // Sugestões
        System.out.println("\nSugestões:");
        if (totalWeight < capacity) {
            System.out.println("- Há espaço disponível. Considere adicionar mais produtos.");
        } else {
            System.out.println("- O espaço foi utilizado de forma eficiente.");
        }
    }
}
