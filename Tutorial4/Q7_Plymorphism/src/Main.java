public class Main {

    public static void main(String[] args) {
        A a1 = new A();
        a1.print();//print A!
        a1 = new B();
        a1.print();//print B!
        a1 = new C();
        a1.print();//print C!
        a1 = new D();
        a1.print();//print D!
        B b1 = new D();
        b1.print();//print D!
        D d1 = (D) b1; // cast line 1 (qn.2. b1 becomes of type D)
        A a2 = new A();
        d1 = (D) a2; // cast line 2 (qn.3. What is wrong in the line accompanied by the comment “cast line 2”?)??????
    }

}
