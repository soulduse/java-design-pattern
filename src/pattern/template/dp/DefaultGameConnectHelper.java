package pattern.template.dp;

/**
 * Created by soul on 2016. 11. 17..
 */
public class DefaultGameConnectHelper extends AbstGameConnectHelper{
    @Override
    String doSecurity(String string) {
        System.out.println("디코드");
        return string;
    }

    @Override
    boolean authentication(String id, String password) {
        System.out.println("아이디/암호 확인 과정");
        return true;
    }

    @Override
    int authorization(String userName) {
        System.out.println("권한 확인");
        return 0;
    }

    @Override
    String connection(String info) {
        System.out.println("마지막 접속단계!");
        return info;
    }
}
