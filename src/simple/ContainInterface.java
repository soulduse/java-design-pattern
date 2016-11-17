package simple;

/**
 * Created by soul on 2016. 11. 17..
 */
public interface ContainInterface {

    int CNT = 0;

    int calcu(int a, int b);

    default void print(boolean bool){
        if(bool)
            System.out.println("success!");
        else
            System.out.println("fail!");
    }
}
