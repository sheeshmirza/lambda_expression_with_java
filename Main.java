import lambdas.Sum;

//Lambda expression is a new and important feature of Java which was included in Java SE 8.
//Lambda expression is a key feature in making Java more expressive and enabling functional programming paradigms.
//Lambda Expressions in Java are the same as lambda functions which are the short block of code that accepts input as parameters and returns a resultant value.

public class Main {
    public static void main(String[] args) {

        // (parameters) -> expression
        Sum<Integer> calculate1 = (Integer x, Integer y) -> x + y;
        System.out.println(calculate1.sum(2, 2));

        // (parameters) -> { statements; }
        Sum<String> calculate2 = (String x, String y) -> {
            Integer result = Integer.parseInt(x) + Integer.parseInt(y);
            return result.toString();
        };
        System.out.println(calculate2.sum("2", "2"));
    }
}