package factory.abstractfactory.factory;

import factory.abstractfactory.product.*;

/**
 * Created by wangshiyi on 17/7/26.
 */

public class ShapeFactory implements AbstractFactory {

    @Override
    public IShape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    public IColor getColor(String color) {
        return null;
    }

}
