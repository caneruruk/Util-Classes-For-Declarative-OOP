package declarative.primitive.conversion;

import declarative.primitive.interfaces.PByte;
import declarative.primitive.interfaces.PString;

final public class PByteAsPString implements PString {
    public PByteAsPString(final PByte value) {
        this.value = value;
    }

    @Override
    public String strValue() {
        return String.valueOf(value.byteValue());
    }

    private final PByte value;
}
