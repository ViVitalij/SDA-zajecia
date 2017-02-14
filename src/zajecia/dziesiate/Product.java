package zajecia.dziesiate;

/**
 * Created by m.losK on 2017-02-13.
 */
public class Product {
    private String name;
    private String origin;
    private double price;

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, String origin, double price) {
        this(name);
        this.origin = origin;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public double getPrice() {
        return price;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return '[' + this.name + ", " + this.origin + ", " + this.price + ']';
    }
}
