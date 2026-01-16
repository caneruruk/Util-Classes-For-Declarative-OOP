package declarative.primitive.arithmetic;

import declarative.primitive.interfaces.PBoolean;

final public class PBooleanNand implements PBoolean {
    public PBooleanNand(final PBoolean left, final PBoolean right) {
        this(new PBooleanNot(new PBooleanAnd(left, right)));
    }

    public PBooleanNand(final PBoolean value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return value.boolValue();
    }

    private final PBoolean value;
}
