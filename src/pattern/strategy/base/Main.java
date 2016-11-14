package pattern.strategy.base;

public class Main {

    public static void main(String[] args) {
        AinterfaceImpl ainterface = new AinterfaceImpl();
        ainterface.funcA();

        AObj aObj = new AObj();
        aObj.funcAA();
    }
}
