package declarative.primitive.choice;

import declarative.primitive.interfaces.PBoolean;

final public class PBooleanChoice implements PBoolean {
    public PBooleanChoice(final PBoolean conditional, final PBoolean trueValue, final PBoolean falseValue) {
        this.conditional = conditional;
        this.trueValue = trueValue;
        this.falseValue = falseValue;
    }

    @Override
    public boolean boolValue() {
        if(conditional.boolValue())
            return trueValue.boolValue();

        return falseValue.boolValue();
    }

    private final PBoolean conditional;
    private final PBoolean trueValue;
    private final PBoolean falseValue;
}
