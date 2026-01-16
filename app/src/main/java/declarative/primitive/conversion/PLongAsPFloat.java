package declarative.primitive.conversion;

import declarative.primitive.interfaces.PFloat;
import declarative.primitive.interfaces.PLong;

final public class PLongAsPFloat implements PFloat {
    public PLongAsPFloat(final PLong value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return (float)value.longValue();
    }

    private final PLong value;
}
