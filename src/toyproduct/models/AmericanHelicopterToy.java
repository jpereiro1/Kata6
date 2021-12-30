package toyproduct.models;

import toyproduct.Toy;

public class AmericanHelicopterToy implements Toy{
    private final Integer serialNumber;
    private final String type;
    
    public AmericanHelicopterToy(Integer serialNumber) {
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
        return "AmericanHelicopterToy{" + "serialNumber=" + serialNumber + ", type=" + type + '}';
    }
    
}
