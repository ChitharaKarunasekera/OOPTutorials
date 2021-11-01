public interface Equation {
    public static int numberOfVariables = 1;

    public double solve();

    public default void printFormula() {
        System.out.println("x^2 + 3x + 1");
    }

}
