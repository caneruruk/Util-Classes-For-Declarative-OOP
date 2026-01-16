package declarative.primitive.comparison;

import declarative.primitive.arithmetic.PBooleanOr;
import declarative.primitive.interfaces.PBoolean;
import declarative.primitive.interfaces.PByte;

final public class PByteIsLessThanOrEqualTo implements PBoolean {
    public PByteIsLessThanOrEqualTo(final PByte left, final PByte right) {
        this(new PBooleanOr(new PByteIsLessThan(left, right), new PByteIsEqualTo(left, right)));
    }

    public PByteIsLessThanOrEqualTo(final PBoolean value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return value.boolValue();
    }

    private final PBoolean value;
}
