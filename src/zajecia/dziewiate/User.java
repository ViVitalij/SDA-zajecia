package zajecia.dziewiate;

/**
 * Created by m.losK on 2017-02-11.
 */
public class User {
    public String firstName;
    public String lastName;
    public String birthDate;
    public Address address;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public User(String firstName, String lastName, String birthDate, Address address) {
        this(firstName, lastName, birthDate);
        this.address = address;
    }

    public void print() {
        System.out.println(firstName + " " + lastName + ", born " + birthDate);
        if (address != null) {
            address.print();
        }
    }
}
