package declarative.primitive.comparison;

import declarative.primitive.arithmetic.PBooleanOr;
import declarative.primitive.interfaces.PBoolean;
import declarative.primitive.interfaces.PString;

final public class PStringIsLessThanOrEqualTo implements PBoolean {
    public PStringIsLessThanOrEqualTo(final PString left, final PString right) {
        this(new PBooleanOr(new PStringIsLessThan(left, right), new PStringIsEqualTo(left, right)));
    }

    public PStringIsLessThanOrEqualTo(final PBoolean value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return value.boolValue();
    }

    private final PBoolean value;
}
