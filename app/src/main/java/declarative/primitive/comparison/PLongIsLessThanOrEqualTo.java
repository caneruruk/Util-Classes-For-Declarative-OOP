package declarative.primitive.comparison;

import declarative.primitive.arithmetic.PBooleanOr;
import declarative.primitive.interfaces.PBoolean;
import declarative.primitive.interfaces.PLong;

final public class PLongIsLessThanOrEqualTo implements PBoolean {
    public PLongIsLessThanOrEqualTo(final PLong left, final PLong right) {
        this(new PBooleanOr(new PLongIsLessThan(left, right), new PLongIsEqualTo(left, right)));
    }

    public PLongIsLessThanOrEqualTo(final PBoolean value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return value.boolValue();
    }

    private final PBoolean value;
}
