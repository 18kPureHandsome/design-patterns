package cn.purehandsome;

/**
 * @author : tianwen.xiao
 * @date : created in 2018/11/29 3:18 PM
 * 懒汉式，线程安全的，由于加了synchronized关键字，所以效率会变差
 */
public class SyncLazyLoadSingleton {

    private static SyncLazyLoadSingleton singleton;

    private SyncLazyLoadSingleton(){}

    public static synchronized SyncLazyLoadSingleton getInstance(){

        if (singleton == null){
            singleton = new SyncLazyLoadSingleton();
        }

        return singleton;
    }
}
