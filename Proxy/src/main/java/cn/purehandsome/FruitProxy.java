package cn.purehandsome;

/**
 * @author : tianwen.xiao
 * @date : created in 2018/12/8 7:59 PM
 * 水果代理类
 */
public class FruitProxy implements Fruit {

    private Fruit fruit;

    public FruitProxy(Fruit fruit){
        this.fruit = fruit;
    }

    @Override
    public void play() {
        fruit.play();
    }
}
