package javadecoratorpattern;

import javadecoratorpattern.memory.*;
import javadecoratorpattern.motherboards.*;
import javadecoratorpattern.processors.*;
import javadecoratorpattern.wrongway.*;

/**
 *
 * The main class for testing
 */
public class Salesman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Firstly the Case component is created,
        //then it is sent to the Corsair8Gb decorator constructor;
        //the Corsair8Gb object is sent to the IntelProcessor decorator constructor;
        //finally the IntelProcessor is sent to the AsusMotherboard constructor
        Decorator decorator = new AsusMotherboard(new IntelProcessor(new Corsair8Gb(new Case())));
        System.out.println("Your PC: " + decorator.getDescription());
        System.out.printf("Price: %.2f\n", decorator.getPrice());
        
        System.out.println();
        
        //Another option of a PC;
        //now the Kingston4Gb, AMDProcessor and GigabyteMotherboard decorators are involved
        decorator = new GigabyteMotherboard(new AMDProcessor(new Kingston4Gb(new Case())));
        System.out.println("Your PC: " + decorator.getDescription());
        System.out.printf("Price: %.2f\n", decorator.getPrice());
        
        System.out.println();
        
        //The wrong way of doing the same thing:
        //it would be necessary to create a lot of classes
        //in order to get all possible combinations.
        //Intel processor PC with Corsair memory
        IntelPC1 pc1 = new IntelPC1();
        System.out.println("Your PC: " + pc1.getDescription());
        System.out.printf("Price: %.2f\n", pc1.getPrice());
        
        System.out.println();
        
        //Intel processor PC with Kingston memory
        IntelPC2 pc2 = new IntelPC2();
        System.out.println("Your PC: " + pc2.getDescription());
        System.out.printf("Price: %.2f\n", pc2.getPrice());
    }
}