package zuoye53;

public class iOSSystemFactory implements SystemFactory{
    public OperationController createOperationController(){
        return new iOSOperationController();
    }
    public InterfaceController createInterfaceController(){
        return new iOSInterfaceController();
    }
}
