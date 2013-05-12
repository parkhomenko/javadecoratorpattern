/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javadecoratorpattern.processors;

import javadecoratorpattern.Decorator;
import javadecoratorpattern.Detail;

/**
 *
 * Concrete decorator
 */
public class AMDProcessor extends Decorator {
    
    public AMDProcessor(Detail detail) {
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
        return super.getDescription() + ", AMD Processor";
    }

    /**
     * Gets the price of the detail (component or a decorator)
     * which is set in the constructor
     * plus the price of the current decorator
     * @return the price
     */
    @Override
    public double getPrice() {
        return super.getPrice() + 125.65;
    }
}