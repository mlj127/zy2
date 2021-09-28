package zuoye53;

public class Client {
    public static void main(String arg[]){
        SystemFactory factory;
        OperationController oc;
        InterfaceController ic;
        factory=(SystemFactory) XMLUtil.getBean();
        oc=factory.createOperationController();
        ic=factory.createInterfaceController();
        oc.display();
        ic.display();
    }
}