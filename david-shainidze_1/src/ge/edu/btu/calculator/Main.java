package ge.edu.btu.calculator;


import ge.edu.btu.calculator.service.impl.CalculatorServiceImpl;

public class Main {
    public static void main(String[] args) {
        CalculatorServiceImpl calculator = new CalculatorServiceImpl();
        calculator.divide(12.45f, 32);
        calculator.divide(1, 0);
        calculator.divide(0.234f, 12);
        calculator.divide(23.23f, 23.4234f);
        calculator.sum(2342.34234f, 234234.234234f);
        calculator.sum(123, 1232123);
        calculator.diff(12, 123.21f);
        calculator.mull(123.123f, 123.32f);
        calculator.mull(2.1f, 2.1f);
    }
}
