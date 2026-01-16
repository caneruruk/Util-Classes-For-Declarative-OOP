package declarative.primitive.conversion;

import declarative.primitive.interfaces.PDouble;
import declarative.primitive.interfaces.PLong;

final public class PDoubleAsPLong implements PLong {
    public PDoubleAsPLong(final PDouble value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return (long)value.doubleValue();
    }

    private final PDouble value;
}
