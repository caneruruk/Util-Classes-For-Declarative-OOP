package declarative.primitive.comparison;

import declarative.primitive.interfaces.PBoolean;
import declarative.primitive.interfaces.PByte;

final public class PByteIsLessThan implements PBoolean {
    public PByteIsLessThan(final PByte left, final PByte right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean boolValue() {
        return left.byteValue() < right.byteValue();
    }

    private final PByte left;
    private final PByte right;
}
