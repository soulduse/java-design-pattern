package pattern.builder;

/**
 * Created by soul on 2016. 11. 26..
 */
public class ComputerFactory {

    private BluePrint print;

    public void setBlueprint(BluePrint blueprint){
        this.print = blueprint;
    }

    public void make(){
        print.setCpu();
        print.setRam();
        print.setStorage();
    }

    public Computer getComputer(){
        return print.getComputer();
    }
}
