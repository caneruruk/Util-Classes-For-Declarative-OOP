package declarative.primitive.conversion;

import declarative.primitive.interfaces.PDouble;
import declarative.primitive.interfaces.PFloat;

final public class PFloatAsPDouble implements PDouble {
    public PFloatAsPDouble(final PFloat value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.floatValue();
    }

    private final PFloat value;
}
