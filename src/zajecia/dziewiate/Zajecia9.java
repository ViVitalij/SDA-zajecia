package zajecia.dziewiate;

/**
 * Created by m.losK on 2017-02-11.
 */
public class Zajecia9 {
    public static void main(String[] args) {

        User user = new User("Mateusz", "Loska", "10.12.1986");
        Address address = new Address("Poznan", "Mlynska", 4, "60-076", "Polska");
        user.address = address;
        user.print();

/*
        Address adress2 = new Address("Tychy", "Budowlanych", 32, "43-100", "Slaskie");
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
