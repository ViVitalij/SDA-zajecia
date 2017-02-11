package zajecia.dziewiate;

/**
 * Created by m.losK on 2017-02-11.
 */
public class Address {
    public String city;
    public String street;
    public int houseNumber;
    public String zipCode;
    public String country;

    //konstruktor
    public Address(String city, String street, int houseNumber, String zipCode, String country) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.country = country;
    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(zipCode)
                .append(" ")
                .append(city)
                .append(", ")
                .append(street)
                .append(" ")
                .append(houseNumber)
                .append(", ")
                .append(country);
        String toPrint = stringBuilder.toString();
        System.out.println(toPrint);
    }
}
