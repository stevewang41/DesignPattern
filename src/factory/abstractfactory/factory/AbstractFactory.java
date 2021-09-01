package factory.abstractfactory.factory;

import factory.abstractfactory.product.IColor;
import factory.abstractfactory.product.IShape;

/**
 * Created by wangshiyi on 17/7/26.
 *
 * 基于给定信息生成实体类对象的抽象工厂
 */

public interface AbstractFactory {

    IColor getColor(String color);

    IShape getShape(String shape);
}
