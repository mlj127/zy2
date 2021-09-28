package zuoye51;

public class HaierAppliancesFactory implements AppliancesFactory{
    public Television createTelevision(){
        return new HaierTelevision();
    }
    public Airconditioner createAirconditioner(){
        return new HaierAirconditioner();
    }
}
