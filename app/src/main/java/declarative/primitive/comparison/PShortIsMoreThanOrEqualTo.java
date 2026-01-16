package declarative.primitive.comparison;

import declarative.primitive.arithmetic.PBooleanOr;
import declarative.primitive.interfaces.PBoolean;
import declarative.primitive.interfaces.PShort;

final public class PShortIsMoreThanOrEqualTo implements PBoolean {
    public PShortIsMoreThanOrEqualTo(final PShort left, final PShort right) {
        this(new PBooleanOr(new PShortIsMoreThan(left, right), new PShortIsEqualTo(left, right)));
    }

    public PShortIsMoreThanOrEqualTo(final PBoolean value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return value.boolValue();
    }

    private final PBoolean value;
}
