public class CalculatorProgram {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.processRequest(Calculator.Command.SUM, 3);
        calc.processRequest(Calculator.Command.SUM, 4);
        calc.processRequest(Calculator.Command.SUB, 7);

        System.out.println("3 + 4 - 7 = 0");
        System.out.println(calc);

        calc.allClear();


        calc.processRequest(Calculator.Command.SUM, 6);
        calc.processRequest(Calculator.Command.SUB, 7);
        calc.processRequest(Calculator.Command.SUM, 4);
        calc.processRequest(Calculator.Command.SUM, 5);

        System.out.println("6 - 7 + 4 + 5 = 8");
        System.out.println(calc);

        calc.allClear();


        calc.processRequest(Calculator.Command.SUM, 11);
        calc.processRequest(Calculator.Command.SUM, 125);
        calc.processRequest(Calculator.Command.SUB, 64);

        System.out.println("11 + 125 - 64 = 72");
        System.out.println(calc);

        calc.allClear();
    }
}
