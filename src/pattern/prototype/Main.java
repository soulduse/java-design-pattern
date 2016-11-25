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


        // 깊은 복사
        Cat navi2 = new Cat();
        navi2.setName("navi");

        Cat yo2 = navi2.copy();
        yo2.setName("yo");

        System.out.println(navi2.getName());
        System.out.println(yo2.getName());
    }
}
