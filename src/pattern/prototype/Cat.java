package pattern.prototype;

/**
 * Created by soul on 2016. 11. 25..
 */
public class Cat implements Cloneable{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Cat copy() throws CloneNotSupportedException{
        Cat cat = (Cat)this.clone();
        return cat;
    }
}
