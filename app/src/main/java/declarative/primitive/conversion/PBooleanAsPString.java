package declarative.primitive.conversion;

import declarative.primitive.interfaces.PBoolean;
import declarative.primitive.interfaces.PString;

final public class PBooleanAsPString implements PString {
    public PBooleanAsPString(final PBoolean value) {
        this.value = value;
    }

    @Override
    public String strValue() {
        return String.valueOf(value.boolValue());
    }

    private final PBoolean value;
}
