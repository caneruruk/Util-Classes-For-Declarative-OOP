package declarative.primitive.arithmetic;

import declarative.primitive.interfaces.PFloat;

final public class PFloatDiv implements PFloat {
    public PFloatDiv(final PFloat left, final PFloat right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public float floatValue() {
        return left.floatValue() / right.floatValue();
    }

    private final PFloat left;
    private final PFloat right;
}
