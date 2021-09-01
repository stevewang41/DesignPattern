package factory.factorymethod.factory;

import factory.factorymethod.product.Circle;
import factory.factorymethod.product.IShape;

/**
 * Created by wangshiyi on 17/8/10.
 *
 * 具体工厂
 */

public class CircleFactory implements ShapeFactory {

    @Override
    public IShape getShape() {
        return new Circle();
    }
}
