package declarative.primitive.conversion;

import declarative.primitive.interfaces.PDouble;
import declarative.primitive.interfaces.PLong;

final public class PLongAsPDouble implements PDouble {
    public PLongAsPDouble(final PLong value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.longValue();
    }

    private final PLong value;
}
