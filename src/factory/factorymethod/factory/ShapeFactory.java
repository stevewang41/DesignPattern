package factory.factorymethod.factory;

import factory.factorymethod.product.IShape;

/**
 * Created by wangshiyi on 17/7/26.
 *
 * 抽象工厂角色：是工厂方法模式的核心，把类的实例化推迟到子类中
 */

public interface ShapeFactory {

    IShape getShape();
}

