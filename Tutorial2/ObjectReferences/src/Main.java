import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //With objet references
        System.out.println("\nWith Object references");
        Rectangle r1 = new Rectangle(0, 0, 100, 50);

        /* Your code goes here */
        //Rectangle r2 = new Rectangle(0,0,100,50);
        //modify line according to Qn.2
        Rectangle r2 = r1;

        System.out.println("r1 : " + r1);//r1 has the address of r1 stored in the location

        /* and here */
        r2.grow(10,20);
        System.out.println("r2 : " + r2);//r2 has the same location as r1 as they are object references. Therefore if r1 was printed afterwords,
        // the output will be equivalent to r2.


        //With number references
        System.out.println("\nWith Number references");
        double n1 = 150;
        double n2 = n1;
        n2 = n2 * 20; // grow n2
        System.out.println(n1);//outputs 150.0 as n1 address has 150 init
        System.out.println(n2);//outputs 3000.0 as n2 has the value of n1 in it, but stored in another memory address.
        //n1 and n2 are two individual int addresses. n2's change won't affect to n1

    }
}
