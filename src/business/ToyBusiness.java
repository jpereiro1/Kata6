package business;

import toyproduct.Toy;

public abstract class ToyBusiness {
    public final SerialNumberGenerator serialNumber = new SerialNumberGenerator();

    public abstract Toy createToy(String type);

}
