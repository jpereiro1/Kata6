package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.Toy;
import business.ToyBusiness;
import factories.ToyFactory;
import factories.regionalfactories.AmericanToyFactory;
import factories.regionalfactories.AsianToyFactory;


public class Kata6 {


    public static void main(String[] args) {   
        AmericanToyFactory americanToyFactory = new AmericanToyFactory();
        AsianToyFactory asianToyFactory = new AsianToyFactory();
        ToyBusiness toyBusiness = new ToyBusiness(asianToyFactory);
        
        ArrayList<Toy> toys = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        String linea = "";
        
        while(!"exit".equals(linea)){
            linea = sc.nextLine();
            switch(linea){
                case "car":
                case "helicopter":
                    toys.add(toyBusiness.produceToy(linea));
                    System.out.println("Built toys: "+ toys
                        .stream()
                        .map(Object::toString)
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
