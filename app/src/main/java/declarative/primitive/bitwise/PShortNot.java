package declarative.primitive.bitwise;

import declarative.primitive.interfaces.PShort;

final public class PShortNot implements PShort {
    public PShortNot(final PShort value) {
        this.value = value;
    }

    @Override
    public short shortValue() {
        return (short)~value.shortValue();
    }

    private final PShort value;
}
