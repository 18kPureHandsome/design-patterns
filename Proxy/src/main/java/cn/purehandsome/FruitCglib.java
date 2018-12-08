package cn.purehandsome;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author : tianwen.xiao
 * @date : created in 2018/12/8 8:25 PM
 * cglib动态代理
 */
public class FruitCglib implements MethodInterceptor {

    public Object getInstance(Class clazz){
        //通过Enhancer 创建代理对象
        Enhancer enhancer = new Enhancer();
        //获取代理对象
        enhancer.setSuperclass(clazz);
        //设置回调，需要实现intercept方法
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 回调方法
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        methodProxy.invokeSuper(o,objects);
        return null;
    }
}
