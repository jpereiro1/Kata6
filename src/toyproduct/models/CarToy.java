package toyproduct.models;

import toyproduct.Toy;

public class CarToy implements Toy{
    private final Integer serialNumber;
    private final String type;
    
    public CarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.type = "Car";
    }
    
    
    
    @Override
    public void pack(){
        System.out.println("Packing toy with S/N: " + this.getSerialNumber());
    }
    
    @Override
    public void label(){
        System.out.println("Labeling toy with S/N: " + this.getSerialNumber());
    }

    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "CarToy{" + "serialNumber=" + serialNumber + ", type=" + type + '}';
    }
    
    
    
    
}
