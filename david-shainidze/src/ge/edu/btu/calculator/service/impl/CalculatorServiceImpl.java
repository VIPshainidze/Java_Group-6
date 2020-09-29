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
        if (y == 0) System.out.println("Zero Division Error <3");
        else System.out.println(x / y);
    }
    public void divide(float x, float y) {
        if (y == 0) System.out.println("Zero Division Error <3");
        else System.out.println(x / y);
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
