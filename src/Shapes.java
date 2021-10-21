public class Shapes {
    public static void main(String[] args) {
        printTriangle();
        space();
        printRectangle();
        space();
        printSquare();
    }

    private static void printTriangle() {
        System.out.println("    *    ");
        System.out.println("   * *   ");
        System.out.println("  *   *  ");
        System.out.println(" *     * ");
        System.out.println("*********");
    }

    private static void printRectangle() {
        System.out.println("**********");
        System.out.println("*        *");
        System.out.println("**********");
    }

    private static void printSquare() {
        System.out.println("************");
        System.out.println("*          *");
        System.out.println("*          *");
        System.out.println("*          *");
        System.out.println("*          *");
        System.out.println("************");
    }

    private static void space() {
        System.out.println();
    }
}
