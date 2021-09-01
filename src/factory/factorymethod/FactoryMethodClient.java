package factory.factorymethod;

import factory.factorymethod.factory.CircleFactory;
import factory.factorymethod.factory.RectangleFactory;
import factory.factorymethod.factory.ShapeFactory;
import factory.factorymethod.factory.SquareFactory;
import factory.factorymethod.product.IShape;

/**
 * Created by wangshiyi on 17/8/10.
 *
 * 工厂方法模式（Factory Method），解决了简单工厂违背开闭原则的问题
 * 如果要添加一个产品类，对于工厂而言，只需要添加一个对应的产品工厂类，并实现抽象工厂，而不用修改任何一个已有的工厂类
 *
 */

public class FactoryMethodClient {

    public static void main(String[] args) {

        ShapeFactory circleFactory = new CircleFactory();
        IShape circle = circleFactory.getShape();
        circle.draw();

        ShapeFactory rectangleFactory = new RectangleFactory();
        IShape rectangle = rectangleFactory.getShape();
        rectangle.draw();

        ShapeFactory squareFactory = new SquareFactory();
        IShape square = squareFactory.getShape();
        square.draw();
    }
}
