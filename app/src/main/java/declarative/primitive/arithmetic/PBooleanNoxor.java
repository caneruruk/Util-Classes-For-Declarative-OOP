package declarative.primitive.arithmetic;

import declarative.primitive.interfaces.PBoolean;

final public class PBooleanNoxor implements PBoolean {
    public PBooleanNoxor(final PBoolean left, final PBoolean right) {
        this(new PBooleanNot(new PBooleanXor(left, right)));
    }

    public PBooleanNoxor(final PBoolean value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return value.boolValue();
    }

    private final PBoolean value;
}
