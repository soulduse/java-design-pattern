package pattern.adapter;

/**
 * Created by soul on 2016. 11. 15..
 */
public class AdapterImpl implements Adapter{

    public Float twiceOf(Float number){
        return Math.doubled(number.doubleValue()).floatValue();
    }

    /* Math 클래스에서 로그를 찍는 기능을 추가 할 수도 있지만,
       보통의 경우 Math 클래스는 라이브러리 형태로 배포가 되어
       일반 사용자들이 모두 사용하고 있을테고, 우리만 테스트 해보기 위해선
       Impl에 하는 것이 일반적이다.
     */
    public Float halfOf(Float number){
        System.out.println("절반 구하는 함수");
        return (float)Math.half(number.doubleValue());
    }
}
