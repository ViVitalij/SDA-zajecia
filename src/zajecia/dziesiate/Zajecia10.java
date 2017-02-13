package zajecia.dziesiate;

import zajecia.dziewiate.User;

import java.util.HashMap;

/**
 * Created by m.losK on 2017-02-13.
 */
public class Zajecia10 {
    public static void main(String[] args) {
//        Product product = new Product("cucumber");
//        Product product2 = new Product("tomato");
//        Product product3 = new Product("potato");
//
//        product.setPrice(6.39);
//        product2.setPrice(4.99);
//        product3.setPrice(0.99);
//
//        product.setDescription("dlugi");
//        product2.setDescription("czerwony");
//        product3.setDescription("ze skorka");

//        System.out.println(product.toString());
//        System.out.println(product2.toString());
//        System.out.println(product3.toString());



//        System.out.println(client);
//
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
        Client client2 = new Client("Jan", "Kowalski");

        Product banana = new Product("Banana", "asdfadf", 2.99);
        Product pineaplle = new Product("Pineapple", "asdfa", 3.99);


        HashMap<Product, Integer> products = new HashMap<>();
        products.put(banana, 500);
        products.put(pineaplle, 300);

//        Order order = new Order(client, products);
//        System.out.println("Total price for this order is " + order.getFullPrice());
        Warehouse warehouse = new Warehouse(products);
        HashMap<Product, Integer> productIntegerHashMap = warehouse.get(banana,600);
        System.out.println();
    }
}
