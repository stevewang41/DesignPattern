package factory.simplefactory;

import factory.simplefactory.factory.ShapeFactory;
import factory.simplefactory.product.IShape;

/**
 * Created by wangshiyi on 17/7/26.
 *
 * 简单工厂（Simple Factory）虽然比较常用，但它并不是23种GoF（Gang of Four）设计模式之一
 * 简单工厂违背了开闭原则（对扩展开放，对修改关闭），如果要添加一个产品类，就要修改工厂类中的方法
 * 可以结合配置文件和反射来对其缺点进行弥补
 *
 * 大部分资料中介绍简单工厂目的是为了引出工厂方法（Factory Method）模式
 */

public class SimpleFactoryClient {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        IShape IShape1 = shapeFactory.getShape("CIRCLE");
        if (IShape1 != null){
            IShape1.draw();
        }

        IShape IShape2 = shapeFactory.getShape("RECTANGLE");
        if (IShape2 != null){
            IShape2.draw();
        }

        IShape IShape3 = shapeFactory.getShape("SQUARE");
        if (IShape3 != null){
            IShape3.draw();
        }
    }
}
