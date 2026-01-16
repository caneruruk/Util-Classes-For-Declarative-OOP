package declarative.primitive.bitwise;

import declarative.primitive.interfaces.PShort;

final public class PShortNand implements PShort {
    public PShortNand(final PShort left, final PShort right) {
        this(new PShortNot(new PShortAnd(left, right)));
    }

    public PShortNand(final PShort value) {
        this.value = value;
    }

    @Override
    public short shortValue() {
        return value.shortValue();
    }

    private final PShort value;
}
