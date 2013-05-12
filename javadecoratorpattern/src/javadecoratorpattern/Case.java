package javadecoratorpattern;

/**
 *
 * Base component
 */
public class Case implements Detail {
    
    /**
     * Operation which returns a name for the component
     * @return name of the component
     */
    @Override
    public String getDescription() {
        return "Mid Tower Case";
    }

    /**
     * Operation which returns a price for the component
     * @return price of the component
     */
    @Override
    public double getPrice() {
        return 155.89;
    }
}