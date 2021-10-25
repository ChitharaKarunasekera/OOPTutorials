public class CreditCard extends Card{
    private int pinNumber;
    private int number;

    public CreditCard(){
    }

    public CreditCard(String n, int pin, int num){
        super(n);//constructor of class Card (parent class). Assigns n as name
        pinNumber = pin;
        number = num;
    }

    @Override
    public boolean isExpired() {
        return false;
    }
}