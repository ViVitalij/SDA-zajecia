package zajecia.dziesiate;

import javafx.util.Pair;

import java.util.HashMap;

/**
 * Created by m.losK on 2017-02-13.
 */
public class Zajecia10 {
    public static void main(String[] args) {
//        HashMap<String, User> map = new HashMap<>();
//        map.put("123", new User("Szymon", "Nowak"));
//        map.put("124", new User("Mateusz", "Loska"));
//        map.forEach((k,v)->{
//            System.out.print(k);
//            System.out.println(v);
//            System.out.println();
//        });
//        User user = map.get("123");
//        System.out.println(user);

        Client client = new Client("Adam", "Nowak");
        Client janKowalski = new Client("Jan", "Kowalski");

        Product banana = new Product("Banana", "Columbia", 3.99);
        Product pineaplle = new Product("Pineapple", "Costarica", 5.99);
        Product apple = new Product("Apple", "Poland", 2.99);


        HashMap<Product, Integer> productsInWarehouse = new HashMap<>();
        productsInWarehouse.put(banana, 500);
        productsInWarehouse.put(pineaplle, 300);
        productsInWarehouse.put(apple, 1000);

//        Order order = new Order(client, productsInWarehouse);
//        System.out.println("Total price for this order is " + order.getFullPrice());
        Warehouse warehouse = new Warehouse(productsInWarehouse);
        Store uLoski = new Store(warehouse);
        Order order = uLoski.createOrder(janKowalski);
//        order.addToOrder(banana, 500);
        uLoski.addToBasket(order, banana, 499);
        order.finish();
        System.out.println(order.getBasket());
        System.out.println();

//        Pair takeProductFromWarehouse = warehouse.get(banana,400);
        System.out.println("In the warehouse is still " + productsInWarehouse.get(banana) + " bananas");
    }
}
