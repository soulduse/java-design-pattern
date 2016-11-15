package pattern.strategy.exam;

/**
 * Created by soul on 2016. 11. 15..
 */
public class Knife implements Weapon {

    @Override
    public void attack() {
        System.out.println("칼 공격");
    }
}
