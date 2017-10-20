package factory.abstractfactory.product;

/**
 * Created by wangshiyi on 17/7/26.
 */

public class Red implements IColor {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
