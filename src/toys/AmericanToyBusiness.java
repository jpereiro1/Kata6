
package toys;

import toyproduct.Toy;
import toyproduct.models.AmericanCarToy;
import toyproduct.models.AmericanHelicopterToy;

public class AmericanToyBusiness extends ToyBusiness{
    @Override
    public Toy createToy(String type){
        switch(type){
            case "car":
                AmericanCarToy americanCar = new AmericanCarToy(serialNumber.next());
                americanCar.pack();
                americanCar.label();
                return (Toy)americanCar;
            case "helicopter":
                AmericanHelicopterToy americanHelicopter = new AmericanHelicopterToy(serialNumber.next());
                americanHelicopter.pack();
                americanHelicopter.label();
                return (Toy)americanHelicopter;
            default:
                return null;
        }
    }
}
