package toyproduct.models;

import toyproduct.Toy;

public class HelicopterToy implements Toy{
    private final Integer serialNumber;
    private final String type;
    
    public HelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.type = "Helicopter";
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
