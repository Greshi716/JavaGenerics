package EcommerceShopping.product;

import java.util.ArrayList;
import java.util.List;

public class ProductFactory {

    private final List<Product> productList = new ArrayList<>();

    public Product createProduct(final String name, final double price, final String category) {
        Product product;
        if ("electronics".equalsIgnoreCase(category)) {
            product = new ElectronicsProduct(name, price);
        } else if ("clothing".equalsIgnoreCase(category)) {
            product = new ClothingProduct(name, price);
        } else {
            throw new IllegalArgumentException("Unsupported category: " + category);
        }

        productList.add(product);
        return product;
    }

    public Product getProduct(final String name) {
        return productList.stream().filter(p -> p.getName().equals(name)).findFirst().orElse(null);
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(productList);
    }
}