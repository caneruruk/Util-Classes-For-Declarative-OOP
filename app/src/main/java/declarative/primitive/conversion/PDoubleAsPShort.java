package declarative.primitive.conversion;

import declarative.primitive.interfaces.PDouble;
import declarative.primitive.interfaces.PShort;

final public class PDoubleAsPShort implements PShort {
    public PDoubleAsPShort(final PDouble value) {
        this.value = value;
    }

    @Override
    public short shortValue() {
        return (short)value.doubleValue();
    }

    private final PDouble value;
}
