package pattern.builder;

/**
 * Created by soul on 2016. 11. 26..
 */
public abstract class BluePrint {

    abstract public void setCpu();
    abstract public void setRam();
    abstract public void setStorage();

    abstract public Computer getComputer();
}
