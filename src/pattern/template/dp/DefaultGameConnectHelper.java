package pattern.template.dp;

/**
 * Created by soul on 2016. 11. 17..
 */
public class DefaultGameConnectHelper extends AbstGameConnectHelper{
    @Override
    String doSecurity(String string) {
        System.out.println("강화된 알고리즘을 이용한 디코드");
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

        // 서버에서 유저의 이름을 가지고 유저의 나이를 알 수 있다.
        // 나이를 확인하고 시간을 확인하여 성인이 아니고 10시가 지났다면
        // 권한이 없는 것으로 간주.
        return 0;
    }

    @Override
    String connection(String info) {
        System.out.println("마지막 접속단계!");
        return info;
    }
}
