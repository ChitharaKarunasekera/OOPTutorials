public class Passport extends Card{
    private String birthLocation;
    private int expirationYear;

    public Passport(){
    }

    public Passport(String n, String birthLocation, int expirationYear){
        super(n);
        this.birthLocation = birthLocation;
        this.expirationYear = expirationYear;
    }

    @Override
    public boolean isExpired(){
        if (expirationYear < 2022) {
            return false;
        }
        return true;
    }

    public String getBirthLocation() {
        return birthLocation;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    @Override
    public void format() {
        super.format();
        System.out.println();
    }
}
