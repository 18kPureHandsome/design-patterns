package cn.pureHandsome;

import cn.purehandsome.*;

/**
 * @author : tianwen.xiao
 * @date : created in 2018/12/1 9:24 PM
 */
public class AppTest {



    @org.junit.Test
    public void test(){
        AbstractFactory factory = new ProduceFactory();
        Fish goldfish = factory.getFish("goldfish");
        Bird sparrow = factory.getBird("sparrow");
        Bird hawk = factory.getBird("hwak");
        Fish carp = factory.getFish("carp");
        hawk.fly();
        goldfish.swiming();
        sparrow.fly();
        carp.swiming();
    }
}
