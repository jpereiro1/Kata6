package business;

import factories.SerialNumberGenerator;
import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;
import toyproduct.Toy;

public class ToyBusiness {
    final private SerialNumberGenerator generator = new SerialNumberGenerator();
    final private Map<String,ToyFactory> toyFactories = new HashMap<String,ToyFactory>();
    
    
    public Toy produceToy(String type){
        return this.toyFactories.get(type).produceToy(generator.next());
    }
    
    public void add(String name,ToyFactory toyFactory){
        this.toyFactories.put(name, toyFactory);
    }
    
}
