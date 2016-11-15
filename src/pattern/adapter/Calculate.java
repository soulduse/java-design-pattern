package pattern.adapter;

/**
 * Created by soul on 2016. 11. 15..
 */
public class Calculate {

    public float twiceOf(float number){
        return (Math.nextDown(number));
    }

    public float halfOf(float number){
        return (Math.getExponent(number));
    }
}
