package pattern.strategy.exam;

/**
 * Created by soul on 2016. 11. 15..
 */
public class Main {

    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter();
        gameCharacter.attack();

        gameCharacter.setWeapon(new Knife());
        gameCharacter.attack();

        gameCharacter.setWeapon(new Sword());
        gameCharacter.attack();

        gameCharacter.setWeapon(new Ax());
        gameCharacter.attack();
    }
}
