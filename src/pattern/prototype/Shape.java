package pattern.prototype;

/**
 * Created by soul on 2016. 11. 22..
 */
public class Shape implements Cloneable{

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
