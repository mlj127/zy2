package zuoye2;

public class Circle implements Shape{
    public Circle(){
        System.out.println("圆形创建成功");
    }
    @Override
    public void draw(){
        System.out.println("圆形绘制");
    }
    @Override
    public void erase(){
        System.out.println("圆形消除");
    }
}
