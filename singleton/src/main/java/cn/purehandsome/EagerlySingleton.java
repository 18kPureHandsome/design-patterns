package cn.purehandsome;

/**
 * @author tianwen.xiao
 * @date : created in 2018/11/29 2:19 PM
 * 线程安全，实现简单，类初始化时就加载，浪费内存
 *
 */
public class EagerlySingleton {

    private static EagerlySingleton singleton = new EagerlySingleton();

    private EagerlySingleton(){}

    public static EagerlySingleton getInstance(){

        return singleton;
    }
}
