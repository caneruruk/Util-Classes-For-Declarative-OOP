package declarative.primitive.arithmetic;

import declarative.primitive.interfaces.PLong;

final public class PLongSub implements PLong {
    public PLongSub(final PLong left, final PLong right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public long longValue() {
        return left.longValue() - right.longValue();
    }
    
    private final PLong left;
    private final PLong right;
}
