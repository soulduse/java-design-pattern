package pattern.strategy.exam;

/**
 * Created by soul on 2016. 11. 15..
 */
public class GameCharacter {

    private Weapon weapon;

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(){
        if(weapon == null){
            System.out.println("맨손 공격");
        }else{
            weapon.attack();
        }
    }
}
