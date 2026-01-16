package declarative.primitive.bitwise;

import declarative.primitive.interfaces.PShort;

final public class PShortXor implements PShort {
    public PShortXor(final PShort left, final PShort right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public short shortValue() {
        return (short)(left.shortValue() ^ right.shortValue());
    }

    private final PShort left;
    private final PShort right;
}
