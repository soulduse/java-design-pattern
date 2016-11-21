package pattern.factory.framework;

/**
 * Created by soul on 2016. 11. 22..
 */
public abstract class ItemCreator {

    public Item create(){
        Item item;

        // step1
        requestItemInfo();
        // step2
        item = createItem();
        // step3
        createItemLog();
        return item;
    }

    // 아이템을 생성하기 전에 데이터 베이스에서 아이템 정보를 요청한다.
    abstract protected void requestItemInfo();

    // 아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이터베이스에 아이템 생성.
    abstract protected void createItemLog();

    // 아이템을 생성하는 알고리즘
    abstract protected Item createItem();
}
