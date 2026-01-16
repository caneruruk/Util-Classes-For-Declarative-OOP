package declarative.primitive.conversion;

import declarative.primitive.interfaces.PInteger;
import declarative.primitive.interfaces.PLong;

final public class PLongAsPInteger implements PInteger {
    public PLongAsPInteger(final PLong value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return (int)value.longValue();
    }

    private final PLong value;
}
