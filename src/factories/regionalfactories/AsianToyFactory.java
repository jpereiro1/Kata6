
package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AsianCarToy;
import toyproduct.models.AsianHelicopterToy;


public class AsianToyFactory extends ToyFactory {

    @Override
    public Toy createToy(String type) {
        switch(type){
            case "car":
                AsianCarToy asianCar = new AsianCarToy(this.generator.next());
                return (Toy)asianCar;
            case "helicopter":
                AsianHelicopterToy asianHelicopter = new AsianHelicopterToy(this.generator.next());
                return (Toy)asianHelicopter;
            default:
                return null;
        }
    }
    
}
