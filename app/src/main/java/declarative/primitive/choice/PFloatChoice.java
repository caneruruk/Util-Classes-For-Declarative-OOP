package declarative.primitive.choice;

import declarative.primitive.interfaces.PBoolean;
import declarative.primitive.interfaces.PFloat;

final public class PFloatChoice implements PFloat {
    public PFloatChoice(final PBoolean conditional, final PFloat trueValue, final PFloat falseValue) {
        this.conditional = conditional;
        this.trueValue = trueValue;
        this.falseValue = falseValue;
    }

    @Override
    public float floatValue() {
        if(conditional.boolValue())
            return trueValue.floatValue();

        return falseValue.floatValue();
    }

    private final PBoolean conditional;
    private final PFloat trueValue;
    private final PFloat falseValue;
}
