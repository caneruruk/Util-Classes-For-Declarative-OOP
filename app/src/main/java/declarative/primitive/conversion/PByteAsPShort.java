package declarative.primitive.conversion;

import declarative.primitive.interfaces.PByte;
import declarative.primitive.interfaces.PShort;

final public class PByteAsPShort implements PShort {
    public PByteAsPShort(final PByte value) {
        this.value = value;
    }

    @Override
    public short shortValue() {
        return (short)value.byteValue();
    }

    private final PByte value;
}
