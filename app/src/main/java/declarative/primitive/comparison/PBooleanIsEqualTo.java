package declarative.primitive.comparison;

import declarative.primitive.interfaces.PBoolean;

final public class PBooleanIsEqualTo implements PBoolean {
    public PBooleanIsEqualTo(final PBoolean left, final PBoolean right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean boolValue() {
        return left.boolValue() == right.boolValue();
    }

    private final PBoolean left;
    private final PBoolean right;
}
