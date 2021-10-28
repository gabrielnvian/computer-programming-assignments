public class Expression {
    public static void main(String[] args) {
        /*
        "y" is assigned the value 9, because the statement --x decrements x by one and returns the result,
        while also assigning to x itself
         */

        int x = 10, y = --x;

        /*
        In the following two statements, the same thing happens: variables x and y are incremented / decremented.
        Some partial results are also rounded, because we are working with int types, which do not allow decimals.
         */
        System.out.println(x++ / 2 * (3 - x++) + (--x % 7 / 3));
        System.out.println(x++ / 2 * (3 - x++) + (--y % 7 / 3));
    }
}
