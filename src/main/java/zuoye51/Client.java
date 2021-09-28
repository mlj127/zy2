package zuoye51;

public class Client {
    public static void main(String arg[]){
        AppliancesFactory factory;
        Television tv;
        Airconditioner ac;
        factory=(AppliancesFactory)XMLUtil.getBean();
        tv=factory.createTelevision();
        ac=factory.createAirconditioner();
        tv.display();
        ac.display();
    }
}
