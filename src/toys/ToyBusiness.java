package toys;

public class ToyBusiness {
    private SerialNumberGenerator serialNumber = new SerialNumberGenerator();

    
    public Car createCar(){
        Car car = new Car(serialNumber.next());
        car.pack();
        car.label();
        return car;
    }
    
    public Helicopter createHelicopter(){
        Helicopter helicopter = new Helicopter(serialNumber.next());
        helicopter.pack();
        helicopter.label();
        return helicopter;
    }
    
    
}
