package declarative.primitive.bitwise;

import declarative.primitive.interfaces.PInteger;

final public class PIntegerNand implements PInteger {
    public PIntegerNand(final PInteger left, final PInteger right) {
        this(new PIntegerNot(new PIntegerAnd(left, right)));
    }

    public PIntegerNand(final PInteger value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return value.intValue();
    }

    private final PInteger value;
}
