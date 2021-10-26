public class Letter implements Printable{
    private String text;

    public Letter(String text){
        this.text = text;
    }

    public void print(){
        //Display text
        System.out.println("Letter: " + text);
    }
}
