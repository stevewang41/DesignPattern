package factory.factorymethod.factory;

import factory.factorymethod.product.IShape;
import factory.factorymethod.product.Square;

/**
 * Created by wangshiyi on 17/8/10.
 *
 * 具体工厂
 */

public class SquareFactory implements ShapeFactory {

    @Override
    public IShape getShape() {
        return new Square();
    }
}
