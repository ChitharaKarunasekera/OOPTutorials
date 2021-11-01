public abstract class Card {

    private String name;

    public Card() {
        name = "";
    }

    public Card(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public abstract boolean isExpired();

    public void format() {
        System.out.println("Name: " + name);
    }
}
