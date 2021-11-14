public class Calculator {
    public enum Command {
        SUM, SUB
    }

    public Calculator() {
        allClear();
    }

    private int curValue, processedRequests;

    public void processRequest(Command c, int a) {
        if (c == Command.SUM) {
            curValue += a;
        } else if (c == Command.SUB) {
            curValue -= a;
        }

        processedRequests++;
    }

    public void allClear() {
        curValue = 0;
        processedRequests = 0;
    }

    public int getResult() {
        return curValue;
    }

    public String toString() {
        return "current value: " + curValue + ", processed requests: " + processedRequests;
    }
}
