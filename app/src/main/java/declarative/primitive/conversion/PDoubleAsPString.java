package declarative.primitive.conversion;

import declarative.primitive.interfaces.PDouble;
import declarative.primitive.interfaces.PString;

final public class PDoubleAsPString implements PString {
    public PDoubleAsPString(final PDouble value) {
        this.value = value;
    }

    @Override
    public String strValue() {
        return String.valueOf(value.doubleValue());
    }

    private final PDouble value;
}
