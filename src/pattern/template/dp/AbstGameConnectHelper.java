package pattern.template.dp;

/**
 * Created by soul on 2016. 11. 17..
 */
public abstract class AbstGameConnectHelper {

    abstract String doSecurity(String string);
    abstract boolean authentication(String id, String password);
    abstract int authorization(String userName);
    abstract String connection(String info);

    // 템플릿 메소드
    public String requestConnection(String incodedInfo){

        // 보안과정 -> 암호화 된 문자열을 복호화 한다.
        String decodedInfo = doSecurity(incodedInfo);

        // 인증과정 -> 반환된 것을 가지고 아이디 암호를 할당한다.
        String id       = "soul";
        String password = "1234";

        if(!authentication(id, password)){
            throw new Error("ID or Password Error");
        }

        String userName = "userName";
        int i = authorization(userName);

        switch (i){
            case 0: // game manager
                System.out.println("게임 매니저");
                break;
            case 1:
                System.out.println("유료 회원");
                break;
            case 2:
                System.out.println("무료 회원");
                break;
            case 3:
                System.out.println("권한 회원");
                break;
            default:
                System.out.println("기타 상");
                break;
        }


        return connection(decodedInfo);
    }
}
