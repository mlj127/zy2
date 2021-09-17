package zuoye2;

import java.util.Locale;

public class ShapeFactory {
    static public Shape createShapeByName(String name)throws UnsupportedOperationException {
        name = name.toLowerCase();
        Shape res;
        if (name.equalsIgnoreCase("circle")) {
            res = new Circle();
        } else if (name.equalsIgnoreCase("rectangle")) {
            res = new Rectangle();
        } else if (name.equalsIgnoreCase("triangle")) {
            res = new Triangle();
        } else {
           throw new UnsupportedOperationException("没有该名称的图形");
        }
        return res;
    }
}
