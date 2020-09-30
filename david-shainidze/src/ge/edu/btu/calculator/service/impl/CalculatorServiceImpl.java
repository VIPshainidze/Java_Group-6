package ge.edu.btu.calculator.service.impl;

import ge.edu.btu.calculator.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {

    public void sum(int x, int y) {
        System.out.println(x + y);
    }
    public void sum(float x, float y) {
        System.out.println(x + y);
    }
    public void divide(int x, int y) {
        try {
            System.out.println(x / y);
        } catch (ArithmeticException AE) {
            System.out.println(AE.toString());
        }
    }
    public void divide(float x, float y) {
        try {
            System.out.println(x / y);
        } catch (ArithmeticException AE) {
            System.out.println(AE.toString());
        }
    }
    public void diff(int x, int y) {
        System.out.println(x - y);
    }
    public void diff(float x, float y) {
        System.out.println(x - y);
    }
    public void mull(int x, int y) {
        System.out.println(x * y);
    }
    public void mull(float x, float y) {
        System.out.println(x * y);
    }
}
