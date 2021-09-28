package zuoye54;

public class WindowsSystemFactory implements SystemFactory{
    public Button createButton(){
        return new WindowsButton();
    }
    public Text createText(){
        return new WindowsText();
    }
}
