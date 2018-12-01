package cn.pureHandsome;

/**
 * @author : tianwen.xiao
 * @date : created in 2018/12/1 9:55 PM
 * 工厂生成类
 */
public class ProduceFactory extends AbstractFactory{

    @Override
    public Bird getBird(String bird) {
        if("hawk".equals(bird))
            return new Hawk();
        else
            return new Sparrow();
    }

    @Override
    public Fish getFish(String fish) {
        if("goldfish".equals(fish))
            return new Goldfish();
        else
            return new Carp();
    }
}
