package pattern.builder;

/**
 * Created by soul on 2016. 11. 26..
 */
public class Main {
    public static void main(String[] args) {

        // 생성하는 것을 다른 개체들에게 넘겨준다.
        ComputerFactory facotry = new ComputerFactory();
        facotry.setBlueprint(new LgGramBlueprint());

//        facotry.makeAndGet();
        facotry.make();
        Computer computer = facotry.getComputer();
//        Computer computer = new Computer("i7", "16g", "ssd");

        System.out.println(computer.toString());

    }
}
