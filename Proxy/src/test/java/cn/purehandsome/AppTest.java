package cn.purehandsome;

import static org.junit.Assert.assertTrue;

import cn.purehandsome.Apple;
import cn.purehandsome.FruitProxy;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * 代理模式测试类
     */
    @Test
    public void ProxyTest()
    {
        FruitProxy fruitProxy = new FruitProxy(new Apple());

        fruitProxy.play();
    }

    /**
     * 基于JDK的动态代理测试方法，需定义代理类的接口
     */
    @Test
    public void HandlerTest()
    {
        FruitHandler<Fruit> fruitHandler = new FruitHandler<Fruit>(new Apple());

        Fruit fruitProxy = (Fruit)Proxy.newProxyInstance(Fruit.class.getClassLoader(),new Class<?>[]{Fruit.class},fruitHandler);

        ((Fruit) fruitProxy).play();
    }

    /**
     * cglib动态代理测试方法，不需要定义接口
     */
    @Test
    public void CglibTest()
    {
        FruitCglib proxy = new FruitCglib();
        Apple apple = (Apple) proxy.getInstance(new Apple().getClass());
        apple.play();
    }
}
