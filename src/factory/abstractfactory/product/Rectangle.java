package factory.abstractfactory.product;

/**
 * Created by wangshiyi on 17/7/26.
 */

public class Rectangle implements IShape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
