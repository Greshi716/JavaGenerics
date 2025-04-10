package EcommerceShopping.product;

public class ElectronicsProduct extends Product {

    public ElectronicsProduct(final String name, final double price) {
        super(name, price);
    }

    @Override
    public double applyDiscount() {
        return getPrice() * 0.90;
    }

    public void plugin() {
        System.out.println("Plugin " + getName());
    }
}
