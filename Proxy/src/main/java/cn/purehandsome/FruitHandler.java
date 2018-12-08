package cn.purehandsome;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : tianwen.xiao
 * @date : created in 2018/12/8 8:08 PM
 * jdk动态代理
 */
public class FruitHandler<T> implements InvocationHandler {

    private T target;

    public FruitHandler(T target){
        //绑定要代理的对象
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用要代理对象的方法
        Object obj = method.invoke(target,args);
        return obj;
    }
}
