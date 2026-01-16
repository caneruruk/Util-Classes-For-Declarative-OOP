package declarative.primitive.arithmetic;

import declarative.primitive.interfaces.PBoolean;

final public class PBooleanNor implements PBoolean {
    public PBooleanNor(final PBoolean left, final PBoolean right) {
        this(new PBooleanNot(new PBooleanOr(left, right)));
    }

    public PBooleanNor(final PBoolean value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return value.boolValue();
    }

    private final PBoolean value;
}
