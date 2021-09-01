package factory.factorymethod.product;

/**
 * Created by wangshiyi on 17/7/26.
 *
 * 具体产品
 */

public class Circle implements IShape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
