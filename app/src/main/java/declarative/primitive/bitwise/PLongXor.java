package declarative.primitive.bitwise;

import declarative.primitive.interfaces.PLong;

final public class PLongXor implements PLong {
    public PLongXor(final PLong left, final PLong right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public long longValue() {
        return left.longValue() ^ right.longValue();
    }

    private final PLong left;
    private final PLong right;
}
