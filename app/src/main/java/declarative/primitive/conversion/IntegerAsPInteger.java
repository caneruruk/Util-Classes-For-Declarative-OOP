package declarative.primitive.conversion;
import declarative.primitive.interfaces.PInteger;

final public class IntegerAsPInteger implements PInteger {
    public IntegerAsPInteger(final int value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return value;
    }

    private final int value;
}
