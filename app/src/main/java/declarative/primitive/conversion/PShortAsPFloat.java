package declarative.primitive.conversion;

import declarative.primitive.interfaces.PFloat;
import declarative.primitive.interfaces.PShort;

final public class PShortAsPFloat implements PFloat {
    public PShortAsPFloat(final PShort value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return (float)value.shortValue();
    }

    private final PShort value;
}
