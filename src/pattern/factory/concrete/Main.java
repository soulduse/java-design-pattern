package pattern.factory.concrete;

import pattern.factory.framework.Item;
import pattern.factory.framework.ItemCreator;

/**
 * Created by soul on 2016. 11. 22..
 */
public class Main {

    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();

        creator = new MpCreator();
        creator.create();

        item.use();
    }
}
