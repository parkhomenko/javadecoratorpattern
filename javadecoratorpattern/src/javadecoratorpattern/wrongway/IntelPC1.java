package javadecoratorpattern.wrongway;

import javadecoratorpattern.Detail;

/**
 *
 * Intel PC with all details in one class
 */
public class IntelPC1 implements Detail {

    @Override
    public String getDescription() {
        return "Mid Tower Case, Corsair 8 Gb Memory, Intel Processor, Asus Motherboard";
    }

    @Override
    public double getPrice() {
        return 668.99;
    }
}