
package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AmericanCarToy;


public class AmericanCarToyFactory extends ToyFactory{

    @Override
    protected Toy createToy(Integer serialNumber) {
        return new AmericanCarToy(serialNumber);
    }
    
}
