package declarative.primitive.bitwise;

import declarative.primitive.interfaces.PShort;

final public class PShortNoxor implements PShort {
    public PShortNoxor(final PShort left, final PShort right) {
        this(new PShortNot(new PShortXor(left, right)));
    }

    public PShortNoxor(final PShort value) {
        this.value = value;
    }

    @Override
    public short shortValue() {
        return value.shortValue();
    }

    private final PShort value;
}
