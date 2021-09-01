package factory.abstractfactory;

import factory.abstractfactory.factory.AbstractFactory;
import factory.abstractfactory.factory.ColorFactory;
import factory.abstractfactory.factory.ShapeFactory;

/**
 * Created by wangshiyi on 17/7/26.
 *
 * 工厂创造器，通过传递形状或颜色信息来获取工厂
 */

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
