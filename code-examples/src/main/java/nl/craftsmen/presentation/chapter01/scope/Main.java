package nl.craftsmen.presentation.chapter01.scope;

import nl.craftsmen.presentation.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        final Product apple = new Product("apple", 2, 30);
        final Product banana = new Product("banana", 3, 20);

        products.add(apple);
        products.add(banana);

        new ProductFinder().find(products);
    }
}
