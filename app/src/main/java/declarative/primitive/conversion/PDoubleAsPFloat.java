package declarative.primitive.conversion;

import declarative.primitive.interfaces.PDouble;
import declarative.primitive.interfaces.PFloat;

final public class PDoubleAsPFloat implements PFloat {
    public PDoubleAsPFloat(final PDouble value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return (float)value.doubleValue();
    }

    private final PDouble value;
}
