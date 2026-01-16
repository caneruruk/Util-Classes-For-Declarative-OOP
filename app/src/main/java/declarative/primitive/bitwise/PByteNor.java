package declarative.primitive.bitwise;

import declarative.primitive.interfaces.PByte;

final public class PByteNor implements PByte {
    public PByteNor(final PByte left, final PByte right) {
        this(new PByteNot(new PByteOr(left, right)));
    }

    public PByteNor(final PByte value) {
        this.value = value;
    }

    @Override
    public byte byteValue() {
        return value.byteValue();
    }

    private final PByte value;
}
