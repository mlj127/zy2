package zuoye53;

public class WindowsPhoneSystemFactory implements SystemFactory{
    public OperationController createOperationController(){
        return new WindowsPhoneOperationController();
    }
    public InterfaceController createInterfaceController(){
        return new WindowsPhoneInterfaceController();
    }
}
