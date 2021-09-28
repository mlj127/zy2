package zuoye54;

public class Client {
    public static void main(String arg[]){
        SystemFactory factory;
        Button bt;
        Text tx;
        factory=(SystemFactory) XMLUtil.getBean();
        bt=factory.createButton();
        tx=factory.createText();
        bt.display();
        tx.display();
    }
}