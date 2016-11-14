package pattern.strategy.base;

/**
 * Created by soul on 2016. 11. 14..
 */
public class AObj {

    private Ainterface ainterface;

    public AObj(){
        ainterface = new AinterfaceImpl();
    }

    public void funcAA(){
        // 위임한다.
        ainterface.funcA();
        ainterface.funcA();
//        System.out.println("AAA");
//        System.out.println("AAA");

        // ~ 기능이 필요합니다 개발해주세요. 라고 말하고 떠넘기고 개발한다.
    }
}
