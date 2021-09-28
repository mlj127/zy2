package zuoye51;

public class TCLAppliancesFactory implements AppliancesFactory{
    public Television createTelevision(){
        return new TCLTelevision();
    }
    public Airconditioner createAirconditioner(){
        return new TCLAirconditioner();
    }
}
