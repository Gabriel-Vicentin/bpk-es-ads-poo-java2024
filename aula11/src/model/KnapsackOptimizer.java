package model;

import java.util.ArrayList;
import java.util.List;

public class KnapsackOptimizer {
    public static List<Product> optimize(List<Product> products, int capacity) {
        int n = products.size();
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            Product product = products.get(i - 1);
            for (int w = 1; w <= capacity; w++) {
                if (product.weight() <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - product.weight()] + product.value());
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        List<Product> selectedProducts = new ArrayList<>();
        int w = capacity;
        for (int i = n; i > 0 && w > 0; i--) {
            if (dp[i][w] != dp[i - 1][w]) {
                Product product = products.get(i - 1);
                selectedProducts.add(product);
                w -= product.weight();
            }
        }
        return selectedProducts;
    }
}
