public class X2 extends X1{

    //Have to remove final key word in foo() as it needs to be overridden in X3 class
    public void foo(){
        System.out.println("foo() called in X2");
    }
}
