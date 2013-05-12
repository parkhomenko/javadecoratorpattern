package javadecoratorpattern.processors;

import javadecoratorpattern.Decorator;
import javadecoratorpattern.Detail;

/**
 *
 * Concrete decorator
 */
public class IntelProcessor extends Decorator {
    
    public IntelProcessor(Detail detail) {
        super(detail);
    }
    
    /**
     * Gets the description of the detail (component or a decorator)
     * which is set in the constructor
     * plus the description of the current decorator
     * @return the description
     */
    @Override
    public String getDescription() {
        return super.getDescription() + ", Intel Processor";
    }

    /**
     * Gets the price of the detail (component or a decorator)
     * which is set in the constructor
     * plus the price of the current decorator
     * @return the price
     */
    @Override
    public double getPrice() {
        return super.getPrice() + 200.00;
    }
}