package declarative.primitive.conversion;

import declarative.primitive.interfaces.PFloat;
import declarative.primitive.interfaces.PShort;

final public class PFloatAsPShort implements PShort {
    public PFloatAsPShort(final PFloat value) {
        this.value = value;
    }

    @Override
    public short shortValue() {
        return (short)value.floatValue();
    }

    private final PFloat value;
}
