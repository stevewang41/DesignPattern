package factory.abstractfactory;

import factory.abstractfactory.factory.AbstractFactory;
import factory.abstractfactory.product.IColor;
import factory.abstractfactory.product.IShape;

/**
 * Created by wangshiyi on 17/7/26.
 *
 * 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂
 * 该超级工厂又称为其他工厂的工厂
 */

public class AbstractFactoryClient {

    public static void main(String[] args) {

        // 获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        IShape IShape1 = shapeFactory.getShape("CIRCLE");
        IShape1.draw();

        IShape IShape2 = shapeFactory.getShape("RECTANGLE");
        IShape2.draw();

        IShape IShape3 = shapeFactory.getShape("SQUARE");
        IShape3.draw();

        // 获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        IColor IColor1 = colorFactory.getColor("RED");
        IColor1.fill();

        IColor IColor2 = colorFactory.getColor("Green");
        IColor2.fill();

        IColor IColor3 = colorFactory.getColor("BLUE");
        IColor3.fill();
    }
}
