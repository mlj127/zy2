package zuoye2;

public class Rectangle implements Shape{
    public Rectangle(){
        System.out.println("矩形创建成功");
    }
    @Override
    public void draw(){
        System.out.println("矩形绘制");
    }
    @Override
    public void erase(){
        System.out.println("矩形消除");
    }
}
