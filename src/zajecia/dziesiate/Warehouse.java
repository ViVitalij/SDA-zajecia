package zajecia.dziesiate;

import javafx.util.Pair;

import java.util.HashMap;

/**
 * Created by m.losK on 2017-02-13.
 */
public class Warehouse {

    private HashMap<Product, Integer> warehouse;

    public Warehouse(HashMap<Product, Integer> warehouse) {
        this.warehouse = warehouse;
    }

    public boolean hasAmount(Product product, int amount) {
        boolean returnValue = false;
        if (warehouse.containsKey(product)) {
            Integer amountInWarehouse = warehouse.get(product);
            return amount <= amountInWarehouse;
        }
        return returnValue;
//      return warehouse.containsKey(product) && warehouse.get(product);    //another way
    }

    public Pair get(Product product, int amount) {
        if (!hasAmount(product, amount)) {
            System.out.println("Product is unavailable in the warehouse!");
            return null;
        }
        warehouse.put(product, warehouse.get(product) - amount);

        Pair products = new Pair(product, amount);
        return products;
    }

    public void add(Product product, int amount) {
        if (warehouse.containsKey(product)) {
            Integer amountInWarehouse = warehouse.get(product);
            warehouse.put(product, amountInWarehouse + amount);
        } else {
            warehouse.put(product, amount);
        }
    }
}
