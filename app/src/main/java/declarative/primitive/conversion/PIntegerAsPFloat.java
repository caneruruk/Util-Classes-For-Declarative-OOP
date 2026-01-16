package declarative.primitive.conversion;

import declarative.primitive.interfaces.PFloat;
import declarative.primitive.interfaces.PInteger;

final public class PIntegerAsPFloat implements PFloat {
    public PIntegerAsPFloat(final PInteger value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return (float)value.intValue();
    }

    private final PInteger value;
}
