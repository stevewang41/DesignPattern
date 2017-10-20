package factory.abstractfactory.product;

/**
 * Created by wangshiyi on 17/7/26.
 */

public class Green implements IColor {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
