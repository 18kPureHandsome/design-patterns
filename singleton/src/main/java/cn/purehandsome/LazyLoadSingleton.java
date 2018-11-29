package cn.purehandsome;

/**
 * @author : tianwen.xiao
 * @date : created in 2018/11/29 2:50 PM
 * 线程不安全，在需要时才加载
 *
 */
public class LazyLoadSingleton {

    private static LazyLoadSingleton singleton;

    private LazyLoadSingleton(){}

    public static LazyLoadSingleton getInstance(){

        if(singleton == null){

            singleton = new LazyLoadSingleton();
        }
        return singleton;
    }
}
