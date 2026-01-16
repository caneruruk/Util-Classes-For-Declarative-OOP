package declarative.primitive.choice;

import declarative.primitive.interfaces.PBoolean;
import declarative.primitive.interfaces.PInteger;

final public class PIntegerChoice implements PInteger {
    public PIntegerChoice(final PBoolean conditional, final PInteger trueValue, final PInteger falseValue) {
        this.conditional = conditional;
        this.trueValue = trueValue;
        this.falseValue = falseValue;
    }

    @Override
    public int intValue() {
        if(conditional.boolValue())
            return trueValue.intValue();

        return falseValue.intValue();
    }

    private final PBoolean conditional;
    private final PInteger trueValue;
    private final PInteger falseValue;
}
