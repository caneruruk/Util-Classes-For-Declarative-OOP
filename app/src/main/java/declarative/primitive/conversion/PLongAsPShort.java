package declarative.primitive.conversion;

import declarative.primitive.interfaces.PLong;
import declarative.primitive.interfaces.PShort;

final public class PLongAsPShort implements PShort {
    public PLongAsPShort(final PLong value) {
        this.value = value;
    }

    @Override
    public short shortValue() {
        return (short)value.longValue();
    }

    private final PLong value;
}
