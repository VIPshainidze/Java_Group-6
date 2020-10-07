package ge.edu.btu.calculator.service.impl;

import ge.edu.btu.calculator.service.CalculatorService;
import org.apache.log4j.Logger;

public class CalculatorServiceImpl implements CalculatorService {

    final static Logger logger=Logger.getLogger(CalculatorService.class);

    public void sum(int x, int y) {
        logger.info("User inputs X :" + x + " Y : " + y);
        System.out.println(x + y);
    }
    public void sum(float x, float y) {
        logger.info("User inputs X :" + x + " Y : " + y);
        System.out.println(x + y);
    }
    public void divide(int x, int y) {
        logger.info("User inputs X :" + x + " Y : " + y);
        try {
            System.out.println(x / y);
        } catch (ArithmeticException AE) {
            System.out.println(AE.toString());
            logger.error("User doesn't know math fundamentals: :(( Zero Division Error");
        }
    }
    public void divide(float x, float y) {
        logger.info("User inputs X :" + x + " Y : " + y);
        try {
            System.out.println(x / y);
        } catch (ArithmeticException AE) {
            System.out.println(AE.toString());
            logger.error("User doesn't know math fundamentals: :(( Zero Division Error");
        }
    }
    public void diff(int x, int y) {
        logger.info("User inputs X :" + x + " Y : " + y);
        System.out.println(x - y);
    }
    public void diff(float x, float y) {
        logger.info("User inputs X :" + x + " Y : " + y);
        System.out.println(x - y);
    }
    public void mull(int x, int y) {
        logger.info("User inputs X :" + x + " Y : " + y);
        System.out.println(x * y);
    }
    public void mull(float x, float y) {
        logger.info("User inputs X :" + x + " Y : " + y);
        System.out.println(x * y);
    }
}
