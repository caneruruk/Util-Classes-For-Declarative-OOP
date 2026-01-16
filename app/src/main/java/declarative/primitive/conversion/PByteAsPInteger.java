package declarative.primitive.conversion;

import declarative.primitive.interfaces.PByte;
import declarative.primitive.interfaces.PInteger;

final public class PByteAsPInteger implements PInteger {
    public PByteAsPInteger(final PByte value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return (int)value.byteValue();
    }

    private final PByte value;
}
