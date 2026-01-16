package declarative.primitive.conversion;

import declarative.primitive.interfaces.PDouble;
import declarative.primitive.interfaces.PString;

final public class PStringAsPDouble implements PDouble {
    public PStringAsPDouble(final PString value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return Double.parseDouble(value.strValue());
    }

    private final PString value;
}
