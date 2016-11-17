
## 템플릿 메소드 패턴 ( Template Method Pattern )
----

* 정의
    - 알고리즘의 구조를 메소드에 정의하고 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의 하는 패턴.

* 사용목적
    - 구현하려는 알고리즘이 일정한 프로세스가 있다.
    - 구현하려는 알고리즘이 변경 가능성이 있다.

* 단계
    - 알고리즘을 여러 단계로 나눈다.
    - 나눠진 알고리즘의 단계를 메소드로 선언한다.
    - 알고리즘을 수행할 템플릿 메소드를 만든다.
    - 하위 클래스에서 나눠진 메소드들을 구현한다.

```
요구사항
```
* 신작 게임의 접속을 구현을 해주세요.
    - requestConnection(String str):String

* 유저가 게임 접속시 다음을 고려 해야 합니다.
    - 보안과정 : 보안 관련 부분을 처리 합니다.
        - doSecurity(String string):String
    - 인증과정 : user name과 password가 일치하는지 확인합니다.
        - authentication(String id, String password):boolean
    - 권한과정 : 접속자가 유료 회원인지 무료회원인지 게임 마스터 인지 확인합니다.
        - authorization(String userName):int
    - 접속과정 : 접속자에게 커넥션 정보를 넘겨줍니다.
        - connection(String info):String
