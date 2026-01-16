package declarative.primitive.comparison;

import declarative.primitive.arithmetic.PBooleanOr;
import declarative.primitive.interfaces.PBoolean;
import declarative.primitive.interfaces.PInteger;

final public class PIntegerIsMoreThanOrEqualTo implements PBoolean {
    public PIntegerIsMoreThanOrEqualTo(final PInteger left, final PInteger right) {
        this(new PBooleanOr(new PIntegerIsMoreThan(left, right), new PIntegerIsEqualTo(left, right)));
    }

    public PIntegerIsMoreThanOrEqualTo(final PBoolean value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return value.boolValue();
    }

    private final PBoolean value;
}
