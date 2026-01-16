package declarative.primitive.conversion;

import declarative.primitive.interfaces.PLong;
import declarative.primitive.interfaces.PString;

final public class PStringAsPLong implements PLong {
    public PStringAsPLong(final PString value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return Long.parseLong(value.strValue());
    }

    private final PString value;
}
