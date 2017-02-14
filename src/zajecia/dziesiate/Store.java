package zajecia.dziesiate;

import java.util.HashMap;

/**
 * Created by m.losK on 2017-02-13.
 */
public class Store {
    private Warehouse warehouse;

    public Store(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public Order createOrder(Client client) {
        return new Order(client, new HashMap<>());
    }

    public void addToBasket(Order order, Product product, int amount) {
        if (warehouse.hasAmount(product, amount)) {
            order.addToOrder(product, amount);
            warehouse.get(product, amount);
        } else {
            System.out.println("Sorry, out of stock!");
        }
    }

    public void finish(Order order) {
        HashMap<Product, Integer> basket = order.getBasket();
        basket.forEach(((productInBasket, amountOfProductInBasket) -> {
            warehouse.get(productInBasket, amountOfProductInBasket);
        }));
        System.out.println(order.finish());
    }
}
