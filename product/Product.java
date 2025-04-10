package EcommerceShopping.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Product {

    private final String name;
    private final double price;

    public abstract double applyDiscount();

}

