package declarative.primitive.comparison;

import declarative.primitive.interfaces.PBoolean;
import declarative.primitive.interfaces.PFloat;

final public class PFloatIsMoreThan implements PBoolean {
    public PFloatIsMoreThan(final PFloat left, final PFloat right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean boolValue() {
        return Float.compare(left.floatValue(), right.floatValue()) > 0;
    }

    private final PFloat left;
    private final PFloat right;
}
