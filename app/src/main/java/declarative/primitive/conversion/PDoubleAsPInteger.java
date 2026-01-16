package declarative.primitive.conversion;

import declarative.primitive.interfaces.PDouble;
import declarative.primitive.interfaces.PInteger;

final public class PDoubleAsPInteger implements PInteger {
    public PDoubleAsPInteger(final PDouble value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return (int)value.doubleValue();
    }

    private final PDouble value;
}
