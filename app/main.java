package EcommerceShopping.app;

import EcommerceShopping.authentication.Authenticator;
import EcommerceShopping.authentication.BasicAuthAuthenticator;
import EcommerceShopping.authentication.BasicAuthCredentials;
import EcommerceShopping.cart.Cart;
import EcommerceShopping.product.ClothingProduct;
import EcommerceShopping.product.Product;
import EcommerceShopping.product.ProductFactory;

public class main {

    public static void main(String[] args) {
        // Step 1: Authentication
        Authenticator authenticator = new BasicAuthAuthenticator();
        BasicAuthCredentials credentials = new BasicAuthCredentials("basicUser", "validPassword");

        if (!authenticator.authenticate(credentials)) {
            System.out.println("❌ Authentication failed!");
            return;
        }

        System.out.println("✅ Authentication successful!");

        // Step 2: Create products
        ProductFactory productFactory = new ProductFactory();
        Product laptop = productFactory.createProduct("Laptop", 1000, "electronics");
        Product shirt = productFactory.createProduct("Shirt", 30, "clothing");

        // Step 3: Add to cart
        Cart cart = new Cart();
        cart.addProduct(laptop);
        cart.addProduct(shirt);

        productFactory.getAllProducts().stream()
                .map(p -> (ClothingProduct) p)
                .forEach(ClothingProduct::tryOn);

        Authenticator auth = new BasicAuthAuthenticator();
    }


}
