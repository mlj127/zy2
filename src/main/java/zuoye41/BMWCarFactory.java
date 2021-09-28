package zuoye41;

public class BMWCarFactory implements CarFactory{
    public Car createCar(){
        Car car=new BMWCar();
        return car;
    }
}
