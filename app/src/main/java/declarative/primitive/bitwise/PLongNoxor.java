package declarative.primitive.bitwise;

import declarative.primitive.interfaces.PLong;

final public class PLongNoxor implements PLong {
    public PLongNoxor(final PLong left, final PLong right) {
        this(new PLongNot(new PLongXor(left, right)));
    }

    public PLongNoxor(final PLong value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return value.longValue();
    }

    private final PLong value;
}
