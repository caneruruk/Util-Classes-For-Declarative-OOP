package declarative.primitive.arithmetic;

import declarative.primitive.interfaces.PByte;

final public class PByteRem implements PByte {
    public PByteRem(final PByte left, final PByte right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public byte byteValue() {
        return (byte)(left.byteValue() % right.byteValue());
    }

    private final PByte left;
    private final PByte right;
}
