package declarative.primitive.arithmetic;

import declarative.primitive.interfaces.PDouble;

final public class PDoubleAdd implements PDouble {
    public PDoubleAdd(final PDouble left, final PDouble right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double doubleValue() {
        return left.doubleValue() + right.doubleValue();
    }

    private final PDouble left;
    private final PDouble right;
}
