package declarative.primitive.comparison;

import declarative.primitive.interfaces.PBoolean;
import declarative.primitive.interfaces.PDouble;

final public class PDoubleIsLessThan implements PBoolean {
    public PDoubleIsLessThan(final PDouble left, final PDouble right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean boolValue() {
        return Double.compare(left.doubleValue(), right.doubleValue()) < 0;
    }

    private final PDouble left;
    private final PDouble right;
}
