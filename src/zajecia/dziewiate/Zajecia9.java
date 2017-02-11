package zajecia.dziewiate;

import java.util.ArrayList;

/**
 * Created by m.losK on 2017-02-11.
 */
public class Zajecia9 {
    public static void main(String[] args) {
        String message = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        String message2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        String message3 = "Lorem ipsum dolor sit amet.";
        Bookshelf bookShelf = new Bookshelf();
        Author henrykSienkiewicz = new Author("Henryk", "Sienkiewicz");
        Book book = new Book("Ogniem i mieczem", henrykSienkiewicz, 2410, message.split(" "));
        Book book2 = new Book("Ogniem i mieczem", new Author("Anna", "Maria"), 410, message2.split(" "));
        Book book3 = new Book("Potop", henrykSienkiewicz, 110, message3.split(" "));
        bookShelf.add(book);
        bookShelf.add(book2);
        bookShelf.add(book3);
        book.setCategory("Historyczna");
        book2.setCategory("Historyczna");
        book3.setCategory("Historyczna");
        book.setDescription("Nudna");
        book2.setDescription("Nudna");
        book3.setDescription("Nudna");


        ArrayList<Book> booksOf = bookShelf.getBooksOf("He");

        for (Book e : booksOf) {
            System.out.println(e);
        }

        System.out.println("Search query Sie");
        for (Book e : bookShelf.getBooksOf("Sie")) {
            System.out.println(e);
        }
        System.out.println();

/*
        String page = book.getPage(5);
        System.out.println(page);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < book.getNumberOfPages(); i++) {
            System.out.println(book.getPage(i+1));
            System.out.println("Nacisnij enter jesli chcesz przejsc do nowej strony");
            scanner.nextLine();
        }
        System.out.println("Koniec ksiazki");
*/
/*
        User user = new User("Tadeusz", "Nowak", "10.12.1986");
        Address address = new Address("Poznan", "Baraniaka", 4, "60-076", "Polska");
        user.address = address;
        user.print();


        Address adress2 = new Address("Warszawa", "al.Ujazdowskie", 32, "00-022", "Polska");
        Address[] adresses = new Address[2];
        adresses[0] = address;
        adresses[1] = adress2;
        printAdresses(adresses);
        }

        public static void printAdresses(Address[] addresses) {
            for (int i = 0; i < addresses.length; i++) {
                addresses[i].print();
            }
        }
        */
    }
}
