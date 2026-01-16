package declarative.primitive.conversion;

import declarative.primitive.interfaces.PByte;
import declarative.primitive.interfaces.PShort;

final public class PShortAsPByte implements PByte {
    public PShortAsPByte(final PShort value) {
        this.value = value;
    }

    @Override
    public byte byteValue() {
        return (byte)value.shortValue();
    }

    private final PShort value;
}
