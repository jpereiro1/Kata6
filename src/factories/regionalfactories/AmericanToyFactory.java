
package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AmericanCarToy;
import toyproduct.models.AmericanHelicopterToy;


public class AmericanToyFactory extends ToyFactory {

    @Override
    public Toy createToy(String type) {
        switch(type){
            case "car":
                AmericanCarToy americanCar = new AmericanCarToy(this.generator.next());
                return (Toy)americanCar;
            case "helicopter":
                AmericanHelicopterToy americanHelicopter = new AmericanHelicopterToy(this.generator.next());
                return (Toy)americanHelicopter;
            default:
                return null;
        }
    }
    
}
