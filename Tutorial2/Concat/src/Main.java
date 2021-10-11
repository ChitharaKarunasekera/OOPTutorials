public class Main {

    public static void main(String[] args) {
        String animal1 = "quick brown fox ";
        String animal2 = "lazy dog ";
        String article = "the ";
        String action = "jumps over ";

        /* Your work goes here */
        //Qn 2.
        System.out.println("Using contact method");
        System.out.println(article.concat(animal1).concat(action).concat(article).concat(animal2));

        System.out.println("\n");

        //Qn 3.
        System.out.println("Using + operator");
        System.out.println(article + animal1 + action + article + animal2);
    }
}
