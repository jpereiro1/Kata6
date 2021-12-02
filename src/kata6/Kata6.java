package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Car;
import toys.SerialNumberGenerator;


public class Kata6 {


    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        ArrayList<Car> cars = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        String linea = "";
        
        while(!"exit".equals(linea)){
            linea = sc.nextLine();
            if(!"exit".equals(linea)){
                Car car = new Car(generator.next());
                car.pack();
                car.label();
                cars.add(car);
                System.out.println("Built car: "+ cars
                        .stream()
                        .map(c -> c.getSerialNumber().toString())
                        .collect(Collectors.joining(", ")));
                        
            }
        }
        
        
        
        
        
                
    }
    
}
