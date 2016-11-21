package pattern.factory.concrete;

import pattern.factory.framework.Item;
import pattern.factory.framework.ItemCreator;
import java.util.Date;

/**
 * Created by soul on 2016. 11. 22..
 */
public class HpCreator extends ItemCreator {

    @Override
    protected void requestItemInfo() {
        System.out.println("데이터베이스에서 체력회북 물량의 정보를 가져옵니다.");
    }

    @Override
    protected void createItemLog() {
        System.out.println("체력회복 물약을 새로 생성 했습니다."+new Date());
    }

    @Override
    protected Item createItem() {
        return new HpPotion();
    }
}
