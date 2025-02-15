public class FormatSpecifier {
    // different types of print statements in java

    public static void main(String[] args) {
//        System.out.print("Print The message and cursor remains in the same line");
//        System.out.println("something");
        // format specifiers
        // %d for integers, %f for float and double %c for char an %s for strings.

        int a=10;
        float b=20.3f;
        char c='a';
        String str = "Shaked";
        //System.out.println("The value of a is " + a+" value of b is "+b+" value of c is "+c+ " and "+ "value of str is "+str);

        // easy way of doing that:
       // System.out.printf("The value of a is %d, b is %.2f, c is %c and str is %s ", a, b, c, str);
        System.out.format("The value of a is %d, b is %.2f, c is %c and str is %s ", a, b, c, str);

    }
}
