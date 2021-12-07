package toys;

import toyproduct.Toy;
import toyproduct.models.AsianCarToy;
import toyproduct.models.AsianHelicopterToy;

public class AsianToyBusiness extends ToyBusiness{
    @Override
    public Toy createToy(String type){
        switch(type){
            case "car":
                AsianCarToy asianCar = new AsianCarToy(serialNumber.next());
                asianCar.pack();
                asianCar.label();
                return (Toy)asianCar;
            case "helicopter":
                AsianHelicopterToy asianHelicopter = new AsianHelicopterToy(serialNumber.next());
                asianHelicopter.pack();
                asianHelicopter.label();
                return (Toy)asianHelicopter;
            default:
                return null;
        }
    }
}
