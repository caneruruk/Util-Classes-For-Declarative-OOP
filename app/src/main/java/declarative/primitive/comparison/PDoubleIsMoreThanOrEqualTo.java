package declarative.primitive.comparison;

import declarative.primitive.arithmetic.PBooleanOr;
import declarative.primitive.interfaces.PBoolean;
import declarative.primitive.interfaces.PDouble;

final public class PDoubleIsMoreThanOrEqualTo implements PBoolean {
    public PDoubleIsMoreThanOrEqualTo(final PDouble left, final PDouble right) {
        this(new PBooleanOr(new PDoubleIsMoreThan(left, right), new PDoubleIsEqualTo(left, right)));
    }

    public PDoubleIsMoreThanOrEqualTo(final PBoolean value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return value.boolValue();
    }

    private final PBoolean value;
}
