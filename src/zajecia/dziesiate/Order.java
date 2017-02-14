package zajecia.dziesiate;

import java.util.*;

/**
 * Created by m.losK on 2017-02-13.
 */
public class Order {
    private HashMap<Product, Integer> basket;
    private Client client;
    private Date date;
    private double fullPrice;

    public Order(Client client, HashMap<Product, Integer> basket) {
        this.client = client;
        this.basket = basket;
        this.date = new Date();
//        this.fullPrice = countFullPrice();
    }

    public Order addToOrder(Product product, int amount) {       //method for chaining addToOrder
        if (basket.containsKey(product)) {
            Integer amountInBasket = basket.get(product);
            basket.put(product, amountInBasket + amount);
        } else {
            basket.put(product, amount);
        }
        return this;        //odnosi sie do tego obiektu na rzecz ktorego wywolujemy metode.
        // do sprawdzenia co zwraca uzyj this.var; w tym wypadku dostaniesz obiekt klasy Order
    }

    public double finish() {
        return countFullPrice();
    }

    public double countFullPrice() {
        Set<Map.Entry<Product, Integer>> entries = basket.entrySet(); //basket.entrySet().var             //potrzebujemy zbioru (u nas basket)
        Iterator<Map.Entry<Product, Integer>> iterator = entries.iterator(); //entries.iterator().var   //do seta potrzebny iterator
        double totalPrice = 0;
        while (iterator.hasNext()) {                                                                       //dopoki iterator ma elementy w secie
            Map.Entry<Product, Integer> next = iterator.next(); //iterator.next().var                   //pobieramy ten element
            Product product = next.getKey();                        //next.getKey().var                 //zeby dostac sie do key(klucza)
            Integer amount = next.getValue();                    //next.getValue().var                  //zeby dostac sie do value
            double price = product.getPrice();                   //product.getPrice().var               //pobieramy cene jednostkowa produtku
            totalPrice += amount * price;                                                                  //zwracamy wymnozona cene = liczba produktow*jdnostkowa cena
        }
        return totalPrice;
    }

    public HashMap<Product, Integer> getBasket() {
        return basket;
    }

    public Client getClient() {
        return client;
    }

    public Date getDate() {
        return date;
    }

    public double getFullPrice() {
        return fullPrice;
    }
}
