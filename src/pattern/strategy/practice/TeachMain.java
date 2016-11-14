package pattern.strategy.practice;

/**
 * Created by soul on 2016. 11. 15..
 */
public class TeachMain {

    public static void main(String [] args){
        Teacher teacher = new Teacher();
        teacher.teaching();

        teacher.setTeach(new TeacherEng());
        teacher.teaching();

        teacher.setTeach(new TeacherMath());
        teacher.teaching();

        teacher.setTeach(new TeacherScience());
        teacher.teaching();
    }
}
