package declarative.primitive.conversion;

import declarative.primitive.interfaces.PFloat;
import declarative.primitive.interfaces.PInteger;

final public class PFloatAsPInteger implements PInteger {
    public PFloatAsPInteger(final PFloat value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return (int)value.floatValue();
    }

    private final PFloat value;
}
