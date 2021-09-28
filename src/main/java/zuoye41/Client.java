package zuoye41;

public class Client {
    public static void main(String args[]){
        CarFactory factory;
        Car car;
        //factory=new BMWCarFactory();
        factory=new BenzCarFactory();
        car=factory.createCar();
        car.makeCar();
    }
}
