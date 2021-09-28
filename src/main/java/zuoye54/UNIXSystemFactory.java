package zuoye54;

public class UNIXSystemFactory implements SystemFactory{
    public Button createButton(){
        return new UNIXButton();
    }
    public Text createText(){
        return new UNIXText();
    }
}
