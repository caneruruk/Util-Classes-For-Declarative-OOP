package declarative.primitive.arithmetic;

import declarative.primitive.interfaces.PBoolean;

final public class PBooleanAnd implements PBoolean {
    public PBooleanAnd(final PBoolean left, final PBoolean right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean boolValue() {
        return left.boolValue() && right.boolValue();
    }

    private final PBoolean left;
    private final PBoolean right;
}
