package patterns.create.create4_abstract_factory;

/**
 * 具体工厂1
 * <p>
 *
 * @author: 张弓
 * @date: 2018/9/17
 * @version: 1.0.0
 */
public class ConcreteFactory1 implements Factory {

    @Override
    public User createUser() {
        return new ConcreteUser1();
    }
}
