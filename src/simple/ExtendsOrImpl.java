package simple;

/**
 * Created by soul on 2016. 11. 17..
 */
public class ExtendsOrImpl extends ContainAbastract implements ContainInterface {

    public static void main(String[] args) {

        ExtendsOrImpl eoi = new ExtendsOrImpl();
        eoi.print(true);
        System.out.println(eoi.calcu(20, 30));
    }



    @Override
    public int calcu(int a, int b) {
        return 0;
    }

    @Override
    int div(int a, int b) {
        return 0;
    }
}
