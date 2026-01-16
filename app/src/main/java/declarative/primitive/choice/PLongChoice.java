package declarative.primitive.choice;

import declarative.primitive.interfaces.PBoolean;
import declarative.primitive.interfaces.PLong;

final public class PLongChoice implements PLong {
    public PLongChoice(final PBoolean conditional, final PLong trueValue, final PLong falseValue) {
        this.conditional = conditional;
        this.trueValue = trueValue;
        this.falseValue = falseValue;
    }

    @Override
    public long longValue() {
        if(conditional.boolValue())
            return trueValue.longValue();

        return falseValue.longValue();
    }

    private final PBoolean conditional;
    private final PLong trueValue;
    private final PLong falseValue;
}
