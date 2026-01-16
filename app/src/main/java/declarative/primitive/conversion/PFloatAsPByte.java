package declarative.primitive.conversion;

import declarative.primitive.interfaces.PByte;
import declarative.primitive.interfaces.PFloat;

final public class PFloatAsPByte implements PByte {
    public PFloatAsPByte(final PFloat value) {
        this.value = value;
    }

    @Override
    public byte byteValue() {
        return (byte)value.floatValue();
    }

    private final PFloat value;
}
