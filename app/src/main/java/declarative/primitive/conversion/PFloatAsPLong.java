package declarative.primitive.conversion;

import declarative.primitive.interfaces.PFloat;
import declarative.primitive.interfaces.PLong;

final public class PFloatAsPLong implements PLong {
    public PFloatAsPLong(final PFloat value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return (long)value.floatValue();
    }

    private final PFloat value;
}
