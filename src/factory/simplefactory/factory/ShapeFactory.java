package factory.simplefactory.factory;

import factory.simplefactory.product.Circle;
import factory.simplefactory.product.IShape;
import factory.simplefactory.product.Rectangle;
import factory.simplefactory.product.Square;

/**
 * Created by wangshiyi on 17/7/26.
 * <p>
 * 基于给定信息生成实体类对象的简单工厂
 */

public class ShapeFactory {


    /**
     * 也可以将该方法定义成静态的，这样不需要创建工厂对象即可创建产品
     * 静态方法也有缺点，子类虽然可以继承父类的静态方法，但不能通过重写来改变静态方法的行为
     * 即静态方法在编译时就确定了，无法实现运行时的多态
     *
     * @param shapeType
     * @return
     */
    public IShape getShape(String shapeType) {
        IShape shape = null;
        if ("CIRCLE".equalsIgnoreCase(shapeType)) {
            shape = new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
            shape = new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(shapeType)) {
            shape = new Square();
        }
        return shape;
    }


    /**
     * 利用反射，根据类的全限定类名来生产对象
     *
     * @param className
     * @return
     */
    public static IShape getShapeByClass(String className) {
        try {
            IShape shape = (IShape) Class.forName(className).newInstance();
            return shape;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
