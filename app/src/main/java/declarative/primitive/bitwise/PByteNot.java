package declarative.primitive.bitwise;

import declarative.primitive.interfaces.PByte;

final public class PByteNot implements PByte {
    public PByteNot(final PByte value) {
        this.value = value;
    }

    @Override
    public byte byteValue() {
        return (byte)~value.byteValue();
    }

    private final PByte value;
}
