package zuoye52;

public interface Database {
    public Connection createConnection();
    public Statement createStatement();
}
