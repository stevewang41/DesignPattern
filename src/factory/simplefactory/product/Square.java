package factory.simplefactory.product;

/**
 * Created by wangshiyi on 17/7/26.
 *
 * 具体产品
 */

public class Square implements IShape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
