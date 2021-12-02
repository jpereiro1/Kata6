package toys;

import toyproduct.Toy;
import toyproduct.models.HelicopterToy;
import toyproduct.models.CarToy;

public class ToyBusiness {
    private final SerialNumberGenerator serialNumber = new SerialNumberGenerator();

    public Toy createToy(String type){
        switch(type){
            case "car":
                CarToy car = new CarToy(serialNumber.next());
                car.pack();
                car.label();
                return (Toy)car;
            case "helicopter":
                HelicopterToy helicopter = new HelicopterToy(serialNumber.next());
                helicopter.pack();
                helicopter.label();
                return (Toy)helicopter;
            default:
                return null;
        }
    }

}
