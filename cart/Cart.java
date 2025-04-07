package EcommerceShopping.cart;

import EcommerceShopping.product.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Cart {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayCartItems() {
        products.forEach(product -> System.out.println(product.getName() + " - Rs" + product.getPrice()));
    }
}