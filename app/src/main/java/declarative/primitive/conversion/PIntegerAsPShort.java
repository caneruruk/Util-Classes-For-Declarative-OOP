package declarative.primitive.conversion;

import declarative.primitive.interfaces.PInteger;
import declarative.primitive.interfaces.PShort;

final public class PIntegerAsPShort implements PShort {
    public PIntegerAsPShort(final PInteger value) {
        this.value = value;
    }

    @Override
    public short shortValue() {
        return (short)value.intValue();
    }

    private final PInteger value;
}
