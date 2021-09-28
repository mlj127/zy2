package zuoye52;

public class OracleDataBase implements Database{
    public Connection createConnection(){
        return new OracleConnection();
    }
    public Statement createStatement(){
        return new OracleStatement();
    }
}
