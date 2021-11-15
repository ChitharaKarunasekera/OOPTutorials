public class Main {

    public static void main(String[] args) {
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++)
            a[i] = i + 2;

        int b[] = new int[10];

        for (int i = (b.length - 1); i >= 0; i--)
            b[i] = i - 2;

        int c[][] = new int[2][];
        c[0] = b;
        c[1] = a;
        a = b;

        /* print all the values in a, b, c */
        System.out.print("a contains: ");
        for (int e : a)
            System.out.print(e + " ");
        System.out.println();

        System.out.print("b contains: ");
        for (int e : b)
            System.out.print(e + " ");
        System.out.println();

        System.out.println("c contains: ");
        for (int[] r : c) {
            for (int e : r)
                System.out.print(e + " ");
            System.out.println();

        }
    }
}
