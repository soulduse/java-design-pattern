package pattern.strategy.exam;

/**
 * Created by soul on 2016. 11. 14..
 */
public class GameCharacter {

    // 접근점
    private Weapon weapon;

    public GameCharacter(){
        weapon = new Knife();
    }

    // 교환가능
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(){
        // 델리게이트
        weapon.attack();
    }
}
