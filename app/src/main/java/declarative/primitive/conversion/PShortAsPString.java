package declarative.primitive.conversion;

import declarative.primitive.interfaces.PShort;
import declarative.primitive.interfaces.PString;

final public class PShortAsPString implements PString {
    public PShortAsPString(final PShort value) {
        this.value = value;
    }

    @Override
    public String strValue() {
        return String.valueOf(value.shortValue());
    }

    private final PShort value;
}
