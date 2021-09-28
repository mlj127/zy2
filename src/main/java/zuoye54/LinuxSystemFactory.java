package zuoye54;

public class LinuxSystemFactory implements SystemFactory{
    public Button createButton(){
        return new LinuxButton();
    }
    public Text createText(){
        return new LinuxText();
    }
}
