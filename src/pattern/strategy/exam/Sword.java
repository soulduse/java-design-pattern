package pattern.strategy.exam;

/**
 * Created by soul on 2016. 11. 14..
 */
public class Sword implements Weapon{

    @Override
    public void attack() {
        System.out.println("검 공격");
    }
}