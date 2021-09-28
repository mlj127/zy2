package zuoye52;

public class Client {
    public static void main(String arg[]){
        Database database;
        Connection ct;
        Statement sm;
        database=(Database) XMLUtil.getBean();
        ct=database.createConnection();
        sm=database.createStatement();
        ct.display();
        sm.display();
    }
}
