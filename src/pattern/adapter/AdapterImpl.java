package pattern.adapter;

/**
 * Created by soul on 2016. 11. 15..
 */
public class AdapterImpl implements Adapter{

    public Float twiceOf(Float number){
        return (float)Math.twoTime(number.doubleValue());
    }

    public Float halfOf(Float number){
        return (float)Math.half(number.doubleValue());
    }
}
