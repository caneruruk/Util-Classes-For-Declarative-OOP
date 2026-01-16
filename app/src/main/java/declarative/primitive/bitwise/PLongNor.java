package declarative.primitive.bitwise;

import declarative.primitive.interfaces.PLong;

final public class PLongNor implements PLong {
    public PLongNor(final PLong left, final PLong right) {
        this(new PLongNot(new PLongOr(left, right)));
    }

    public PLongNor(final PLong value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return value.longValue();
    }

    private final PLong value;
}
