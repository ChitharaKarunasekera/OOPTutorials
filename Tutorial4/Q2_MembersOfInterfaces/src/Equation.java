public interface Equation {
    double numberOfVariables = 1;

    double solve();

    public default void printFormula() {
        System.out.println("x^2 + 3x + 1");
    }

}
