public class Passport extends Card{
    String birthLocation;
    int expirationYear;

    @Override
    public boolean isExpired(){
        return false;
    }
}
