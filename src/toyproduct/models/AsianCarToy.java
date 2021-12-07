package toyproduct.models;

import toyproduct.Toy;

public class AsianCarToy implements Toy{
    private final Integer serialNumber;
    private final String type;
    
    public AsianCarToy(Integer serialNumber) {
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
        return "AsianCarToy{" + "serialNumber=" + serialNumber + ", type=" + type + '}';
    }
    
    
    
    
}