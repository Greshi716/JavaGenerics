package EcommerceShopping.product;

public class ClothingProduct extends Product {

    public ClothingProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double applyDiscount() {
        return getPrice() * 0.80;
    }

    public void tryOn() {
        System.out.println("Trying on " + getName());
    }
}