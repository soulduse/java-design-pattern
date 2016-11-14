package pattern.strategy.practice;

/**
 * Created by soul on 2016. 11. 15..
 */
public class Teacher {

    private Teach teach;

    public void setTeach(Teach teach){
        this.teach = teach;
    }

    public void teaching(){
        if(teach == null){
            System.out.println("Just talking.");
        }else{
            teach.teachNow();
        }
    }
}
