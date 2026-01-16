package declarative.primitive.bitwise;

import declarative.primitive.interfaces.PByte;

final public class PByteNand implements PByte {
    public PByteNand(final PByte left, final PByte right) {
        this(new PByteNot(new PByteAnd(left, right)));
    }

    public PByteNand(final PByte value) {
        this.value = value;
    }

    @Override
    public byte byteValue() {
        return value.byteValue();
    }

    private final PByte value;
}
