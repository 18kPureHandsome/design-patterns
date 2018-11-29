import cn.purehandsome.*;

/**
 * @author : tianwen.xiao
 * @date : created in 2018/11/29 2:25 PM
 */
public class Test {

    @org.junit.Test
    public void EagerlySingletonTest() {

        EagerlySingleton singleton = EagerlySingleton.getInstance();
        EagerlySingleton singleton1 = EagerlySingleton.getInstance();
        assert singleton == singleton1;
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }

    @org.junit.Test
    public void LazyLoadSingletonTest(){
        LazyLoadSingleton singleton = LazyLoadSingleton.getInstance();
        LazyLoadSingleton singleton1 = LazyLoadSingleton.getInstance();
        assert singleton == singleton1;
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }

    @org.junit.Test
    public void DoubleCheckSingletonTest(){
        DoubleCheckSingleton singleton = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton singleton1 = DoubleCheckSingleton.getInstance();
        assert singleton == singleton1;
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }

    @org.junit.Test
    public void SyncLazyLoadSingletonTest(){
        SyncLazyLoadSingleton singleton = SyncLazyLoadSingleton.getInstance();
        SyncLazyLoadSingleton singleton1 = SyncLazyLoadSingleton.getInstance();
        assert singleton == singleton1;
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }

    @org.junit.Test
    public void StaticInnerSingletonTest() {
        StaticInnerSingleton singleton = StaticInnerSingleton.getInstance();
        StaticInnerSingleton singleton1 = StaticInnerSingleton.getInstance();
        assert singleton == singleton1;
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }

}
