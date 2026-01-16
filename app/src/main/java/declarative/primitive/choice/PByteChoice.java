package declarative.primitive.choice;

import declarative.primitive.interfaces.PBoolean;
import declarative.primitive.interfaces.PByte;

final public class PByteChoice implements PByte {
    public PByteChoice(final PBoolean conditional, final PByte trueValue, final PByte falseValue) {
        this.conditional = conditional;
        this.trueValue = trueValue;
        this.falseValue = falseValue;
    }

    @Override
    public byte byteValue() {
        if(conditional.boolValue())
            return trueValue.byteValue();

        return falseValue.byteValue();
    }

    private final PBoolean conditional;
    private final PByte trueValue;
    private final PByte falseValue;
}
