package declarative.primitive.bitwise;

import declarative.primitive.interfaces.PInteger;

final public class PIntegerNoxor implements PInteger {
    public PIntegerNoxor(final PInteger left, final PInteger right) {
        this(new PIntegerNot(new PIntegerXor(left, right)));
    }

    public PIntegerNoxor(final PInteger value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return value.intValue();
    }

    private final PInteger value;
}
