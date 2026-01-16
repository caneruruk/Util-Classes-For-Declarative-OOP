package declarative.primitive.bitwise;

import declarative.primitive.interfaces.PInteger;

final public class PIntegerXor implements PInteger {
    public PIntegerXor(final PInteger left, final PInteger right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int intValue() {
        return left.intValue() ^ right.intValue();
    }

    private final PInteger left;
    private final PInteger right;
}
