package javadecoratorpattern.wrongway;

import javadecoratorpattern.Detail;

/**
 *
 * Intel PC with all details in one class
 */
public class IntelPC2 implements Detail {

    @Override
    public String getDescription() {
        return "Mid Tower Case, Kingston 8 Gb Memory, Intel Processor, Asus Motherboard";
    }

    @Override
    public double getPrice() {
        return 653.99;
    }
}