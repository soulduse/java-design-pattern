package pattern.adapter.practice;

/**
 * Created by soul on 2016. 11. 16..
 */
public class Main {

    public static void main(String[] args) {
        Adapter adapter = new AdapaterImpl();

        System.out.println(adapter.doubleCal(60f));
        System.out.println(adapter.halfCal(77f));
    }
}
