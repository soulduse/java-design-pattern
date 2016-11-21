
## 팩토리 메소드 패턴 ( Factory Method Pattern )
----

* 목표
    - 팩토리 메소드 패턴에서 템플릿 메소드 패턴의 사용됨을 안다.
    - 팩토리 메소드 패턴에서의 구조와 구현의 분리를 이해하고 구조와 구현의 분리의 장점을 안다.

* 정의
    -

* 사용목적
    -

* 단계
    -
    -
    -
    -

```
요구사항
```
    - 게임 아이템과 아이템 생성을 구현해주세요.
        - 아이템을 생성하기 전에 데이터 베이스에서 아이템 정보를 요청.
        - 아이템 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이터베이스에 아이템 생성 정보를 남긴다.
    - 아이템을 생성하는 주체를 ItemCreator로 이름 짓는다.
    - 아이템은 Item 이라는 interface로 다룰 수 있도록 한다.
        - Item은 use 함수를 기본 함수로 갖고 있다.
    - 현재 아이템의 종류는 체력 회복 물약, 마력 회복 물약이 있다.