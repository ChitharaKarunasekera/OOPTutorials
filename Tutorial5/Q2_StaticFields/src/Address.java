public class Address {
    String street;
    int number;
    String city;

    Address(String street1, int number1, String city1) {
        street = street1;
        number = number1;
        city = city1;
    }

    void print() {
        System.out.println(number + " " + street + " " + city);
    }
}
