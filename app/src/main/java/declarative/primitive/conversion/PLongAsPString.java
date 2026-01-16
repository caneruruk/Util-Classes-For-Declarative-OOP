package declarative.primitive.conversion;

import declarative.primitive.interfaces.PLong;
import declarative.primitive.interfaces.PString;

final public class PLongAsPString implements PString {
    public PLongAsPString(final PLong value) {
        this.value = value;
    }

    @Override
    public String strValue() {
        return String.valueOf(value.longValue());
    }

    private final PLong value;
}
