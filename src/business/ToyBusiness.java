package business;

import factories.SerialNumberGenerator;
import factories.ToyFactory;
import toyproduct.Toy;

public class ToyBusiness {
    final private ToyFactory toyFactory;
    
    public ToyBusiness(ToyFactory toyFactory){
        this.toyFactory = toyFactory;
    }
    
    public Toy produceToy(String type){
        return this.toyFactory.produceToy(type);
    }
    
}
