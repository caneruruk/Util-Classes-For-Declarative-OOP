package declarative.primitive.conversion;

import declarative.primitive.interfaces.PDouble;
import declarative.primitive.interfaces.PInteger;

final public class PIntegerAsPDouble implements PDouble {
    public PIntegerAsPDouble(final PInteger value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.intValue();
    }

    private final PInteger value;
}
