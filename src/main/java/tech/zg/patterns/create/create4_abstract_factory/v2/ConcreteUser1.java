package tech.zg.patterns.create.create4_abstract_factory.v2;

import tech.zg.patterns.create.create4_abstract_factory.v2.User;

/**
 * 具体用户1
 * <p>
 *
 * @author: 张弓
 * @date: 2018/9/17
 * @version: 1.0.0
 */
public class ConcreteUser1 implements User{

    @Override
    public void showName() {
        System.out.println("ConcreteUser1");
    }
}
