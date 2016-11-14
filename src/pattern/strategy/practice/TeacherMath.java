package pattern.strategy.practice;

/**
 * Created by soul on 2016. 11. 14..
 */
public class TeacherMath implements Teach{
    @Override
    public void teachNow() {
        System.out.println("The teacher is teaching math");
    }
}
