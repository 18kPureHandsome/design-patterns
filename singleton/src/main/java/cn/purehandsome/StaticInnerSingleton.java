package cn.purehandsome;

/**
 * @author : tianwen.xiao
 * @date : created in 2018/11/29 3:28 PM
 * 这种方式只适用于静态域的情况，利用了 classloader 机制来保证初始化 instance 时只有一个线程，
 * 只有通过显式调用 getInstance 方法时，
 * 才会显式装载 SingletonHolder 类，从而实例化 instance
 */
public class StaticInnerSingleton {

    private StaticInnerSingleton(){}

    private static class SingletonHolder {
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
