package declarative.primitive.bitwise;

import declarative.primitive.interfaces.PInteger;

final public class PIntegerNor implements PInteger {
    public PIntegerNor(final PInteger left, final PInteger right) {
        this(new PIntegerNot(new PIntegerOr(left, right)));
    }

    public PIntegerNor(final PInteger value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return value.intValue();
    }

    private final PInteger value;
}
