public class DriverLicense extends Card{
    int expirationYear;

    @Override
    public boolean isExpired() {
        return false;
    }
}
