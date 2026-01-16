package declarative.primitive.conversion;

import declarative.primitive.interfaces.PDouble;
import declarative.primitive.interfaces.PShort;

final public class PShortAsPDouble implements PDouble {
    public PShortAsPDouble(final PShort value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.shortValue();
    }

    private final PShort value;
}
