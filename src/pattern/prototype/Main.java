package pattern.prototype;

/**
 * Created by soul on 2016. 11. 22..
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle1 = new Circle(1,1,3);
        Circle circle2 = circle1.copy();

        System.out.println(
                circle1.getX()+","+
                circle1.getY()+","+
                circle1.getR());
        System.out.println(
                circle2.getX()+","+
                circle2.getY()+","+
                circle2.getR());


        // 얕은 복사
        Cat navi = new Cat();
        navi.setName("navi");

        Cat yo = navi;
        yo.setName("yo");

        System.out.println(navi.getName());
        System.out.println(yo.getName());


        /*
            스트링 값은 깊은 복사가 이루어지지만,
            Int 형의 경우 멤버 변수에서 깊은 변수가 이루어지지 않는다.
            따라서 명시적으로 복사를 해주면된다.

         */

        // 깊은 복사
        Cat navi2 = new Cat();
        navi2.setName("navi");
        navi2.setAge(new Age(2012, 4));

        Cat yo2 = navi2.copy();
        yo2.setName("yo");
        yo2.getAge().setYear(2015);
        yo2.getAge().setValue(2);

        System.out.println(navi2.getName());
        System.out.println(yo2.getName());
        System.out.println(navi2.getAge().getYear());
        System.out.println(yo2.getAge().getYear());
    }
}
