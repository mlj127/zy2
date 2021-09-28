package zuoye41;

public class BenzCarFactory implements CarFactory{
    public Car createCar(){
        Car car=new BenzCar();
        return car;
    }
}
