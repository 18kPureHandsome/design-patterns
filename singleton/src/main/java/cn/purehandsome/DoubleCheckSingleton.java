package cn.purehandsome;

/**
 * @author : tianwen.xiao
 * @date : created in 2018/11/29 3:05 PM
 * 双重检查锁，线程安全，在多线程情况下也能保持高性能，实现相对复杂
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton singleton;

    private DoubleCheckSingleton(){}

    public static synchronized DoubleCheckSingleton getInstance(){
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class){
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
