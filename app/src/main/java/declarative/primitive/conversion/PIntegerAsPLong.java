package declarative.primitive.conversion;

import declarative.primitive.interfaces.PInteger;
import declarative.primitive.interfaces.PLong;

final public class PIntegerAsPLong implements PLong {
    public PIntegerAsPLong(final PInteger value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return (long)value.intValue();
    }

    private final PInteger value;
}
