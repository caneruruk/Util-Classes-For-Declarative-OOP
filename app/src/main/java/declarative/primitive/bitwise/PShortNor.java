package declarative.primitive.bitwise;

import declarative.primitive.interfaces.PShort;

final public class PShortNor implements PShort {
    public PShortNor(final PShort left, final PShort right) {
        this(new PShortNot(new PShortOr(left, right)));
    }

    public PShortNor(final PShort value) {
        this.value = value;
    }

    @Override
    public short shortValue() {
        return value.shortValue();
    }

    private final PShort value;
}
