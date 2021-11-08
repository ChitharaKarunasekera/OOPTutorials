public class CalcManager {

    public static boolean isEven(int n){
        if (n%2 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static int cube(int n){
        return n*n*n;
    }

    public static double add(double ...x){
        double total= 0;

        for (double i: x){
            total += i;
        }
        return total;
    }
}
