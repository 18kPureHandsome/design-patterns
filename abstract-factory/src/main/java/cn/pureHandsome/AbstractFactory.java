package cn.pureHandsome;

/**
 * @author : tianwen.xiao
 * @date : created in 2018/12/1 9:19 PM
 * 抽象工厂类
 */
public abstract class AbstractFactory {

    /**
     *
     * @return Bird
     * @param bird
     */
    public abstract Bird getBird(String bird);

    /**
     *
     * @return Fish
     * @param fish
     */
    public abstract Fish getFish(String fish);
}
