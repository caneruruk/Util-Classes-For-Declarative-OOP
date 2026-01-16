package declarative.primitive.bitwise;

import declarative.primitive.interfaces.PLong;

final public class PLongNand implements PLong {
    public PLongNand(final PLong left, final PLong right) {
        this(new PLongNot(new PLongAnd(left, right)));
    }

    public PLongNand(final PLong value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return value.longValue();
    }

    private final PLong value;
}
