package pattern.adapter.practice;

/**
 * Created by soul on 2016. 11. 16..
 */
public class AdapaterImpl implements Adapter{
    @Override
    public Float halfCal(Float f) {
        return Math.getHalfVal(f.doubleValue()).floatValue();
    }

    @Override
    public Float doubleCal(Float f) {
        return Math.getDoubleVal(f.doubleValue()).floatValue();
    }
}
