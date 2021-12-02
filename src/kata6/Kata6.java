package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;


public class Kata6 {


    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Helicopter> helicopters = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        String linea = "";
        
        while(!"exit".equals(linea)){
            linea = sc.nextLine();
            switch(linea){
                case "car":
                    Car car = new Car(generator.next());
                    car.pack();
                    car.label();
                    cars.add(car);
                    System.out.println("Built car: "+ cars
                            .stream()
                            .map(c -> c.getSerialNumber().toString())
                            .collect(Collectors.joining(", ")));
                    break;
                case "helicopter":
                    Helicopter helicopter = new Helicopter(generator.next());
                    helicopter.pack();
                    helicopter.label();
                    helicopters.add(helicopter);
                    System.out.println("Built helicopter: "+ helicopters
                            .stream()
                            .map(c -> c.getSerialNumber().toString())
                            .collect(Collectors.joining(", ")));
                    break;
                    
                default:
                    System.out.println("Command unknown!");
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    break;
                        
            }
        }
        
        
        
        
        
                
    }
    
}
