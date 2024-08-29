package app;

public class Main {

    public static void main(String[] args) {

        Advisor advisePrinter = new AdvisePrinter();

        for (Day day : Day.values()) {
            System.out.println(day + ": ");
            advisePrinter.advise(day);
        }
    }
}