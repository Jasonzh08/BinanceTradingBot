package app;

public class App {
    public static void main(String[] args) {
        SampleCalculator calculator = new SampleCalculator();
        int demoResult = calculator.add(2, 3);
        System.out.println("Sample calculator result: " + demoResult);
    }
}
