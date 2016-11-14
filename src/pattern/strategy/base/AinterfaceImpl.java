package pattern.strategy.base;

/**
 * Created by soul on 2016. 11. 13..
 *
 * 델리게이트 (= 위임하다, 떠넘기다)
 *
 */
public class AinterfaceImpl implements Ainterface {

    @Override
    public void funcA() {
        System.out.println("AAA");
    }
}
