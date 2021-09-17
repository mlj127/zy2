package jiuyue;

public class nvwa {
    public static  zaoren getzaoren(String people){
        zaoren zao=null;
        if(people.equalsIgnoreCase("M")){
            zao=new Man();
        }else if(people.equalsIgnoreCase("W")){
            zao=new Woman();
        }else if(people.equalsIgnoreCase("R")){
            zao=new Robot();
        }
        return zao;
    }
}
