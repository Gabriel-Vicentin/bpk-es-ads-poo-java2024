package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {
        public static void main(String[] args) {

            List<Produto> produtos = new ArrayList<>();
            produtos.add(new Produto("Produto A", 120.0));
            produtos.add(new Produto("Produto B", 90.0));
            produtos.add(new Produto("Produto C", 150.0));
            produtos.add(new Produto("Produto D", 50.0));

            List<Produto> produtosCaros = produtos.stream()
                    .filter(p -> p.getPreco() > 100) .distinct()
                    .collect(Collectors.toList());
            System.out.println("Produtos com preço acima de 100:");
            produtosCaros.forEach(System.out::println);
        }
    }
