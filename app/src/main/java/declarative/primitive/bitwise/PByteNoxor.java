package declarative.primitive.bitwise;

import declarative.primitive.interfaces.PByte;

final public class PByteNoxor implements PByte {
    public PByteNoxor(final PByte left, final PByte right) {
        this(new PByteNot(new PByteXor(left, right)));
    }

    public PByteNoxor(final PByte value) {
        this.value = value;
    }

    @Override
    public byte byteValue() {
        return value.byteValue();
    }

    private final PByte value;
}
