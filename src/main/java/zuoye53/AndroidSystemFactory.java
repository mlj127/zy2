package zuoye53;

public class AndroidSystemFactory implements SystemFactory{
    public OperationController createOperationController(){
        return new AndroidOperationController();
    }
    public InterfaceController createInterfaceController(){
        return new AndroidInterfaceController();
    }
}
