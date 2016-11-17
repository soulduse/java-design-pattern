package pattern.template;

import pattern.template.dp.AbstGameConnectHelper;
import pattern.template.dp.DefaultGameConnectHelper;

/**
 * Created by soul on 2016. 11. 17..
 */
public class Main {
    public static void main(String[] args) {
        AbstGameConnectHelper helper = new DefaultGameConnectHelper();
        helper.requestConnection( "아이디 암호 등 접속 정보");
    }
}
