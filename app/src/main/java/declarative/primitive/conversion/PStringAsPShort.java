package declarative.primitive.conversion;

import declarative.primitive.interfaces.PShort;
import declarative.primitive.interfaces.PString;

final public class PStringAsPShort implements PShort {
    public PStringAsPShort(final PString value) {
        this.value = value;
    }

    @Override
    public short shortValue() {
        return Short.parseShort(value.strValue());
    }

    private final PString value;
}
