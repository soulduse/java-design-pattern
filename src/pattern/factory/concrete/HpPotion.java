package pattern.factory.concrete;

import pattern.factory.framework.Item;

/**
 * Created by soul on 2016. 11. 22..
 */
public class HpPotion implements Item {
    @Override
    public void use() {
        System.out.println("체력 회복!");
    }
}
