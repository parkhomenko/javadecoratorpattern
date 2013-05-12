package javadecoratorpattern;

/**
 *
 * Base decorator
 */
public class Decorator implements Detail {
    
    //has a link to a current component
    private Detail detail;
    
    public Decorator(Detail detail) {
        this.detail = detail;
    }

    /**
     * Gets the description of the component
     * @return description of the component
     */
    @Override
    public String getDescription() {
        return detail.getDescription();
    }

    /**
     * Gets the price of the component
     * @return price of the component
     */
    @Override
    public double getPrice() {
        return detail.getPrice();
    }
}