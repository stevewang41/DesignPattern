package factory.abstractfactory.factory;

import factory.abstractfactory.product.*;

/**
 * Created by wangshiyi on 17/7/26.
 */

public class ColorFactory implements AbstractFactory {

    @Override
    public IColor getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public IShape getShape(String shape) {
        return null;
    }
}
