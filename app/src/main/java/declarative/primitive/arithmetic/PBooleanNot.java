package declarative.primitive.arithmetic;

import declarative.primitive.interfaces.PBoolean;

final public class PBooleanNot implements PBoolean {
    public PBooleanNot(final PBoolean value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return !value.boolValue();
    }

    private final PBoolean value;
}
