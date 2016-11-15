package pattern.adapter;

/**
 * Created by soul on 2016. 11. 15..
 */
public class Main {

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        System.out.println(calculate.halfOf(10));
        System.out.println(calculate.twiceOf(10));
    }
}
