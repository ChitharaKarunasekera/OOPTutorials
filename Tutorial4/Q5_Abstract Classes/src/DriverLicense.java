public class DriverLicense extends Card{
    private int expirationYear;

    public DriverLicense(){
    }

    public DriverLicense(String n, int expirationYear){
        super(n);
        this.expirationYear = expirationYear;
    }

    @Override
    public boolean isExpired() {
        if (expirationYear < 2022) {
            return false;
        }
        return true;
    }

    @Override
    public void format() {
        super.format();
        System.out.println("Expiration Year: " + expirationYear);
    }
}
