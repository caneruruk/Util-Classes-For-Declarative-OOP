package declarative.primitive.bitwise;

import declarative.primitive.interfaces.PInteger;

final public class PIntegerNot implements PInteger {
    public PIntegerNot(final PInteger value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return ~value.intValue();
    }

    private final PInteger value;
}
