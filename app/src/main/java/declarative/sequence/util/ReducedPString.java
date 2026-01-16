package declarative.sequence.util;

import java.util.function.BiFunction;
import declarative.primitive.interfaces.PString;
import declarative.sequence.interfaces.LazySequence;

final public class ReducedPString<T> implements PString{
    public ReducedPString(final LazySequence<T> lazySequence, final BiFunction<PString, T, PString> biFunction, final PString accum) {
        this.lazySequence = lazySequence;
        this.biFunction = biFunction;
        this.accum = accum;
    }

    @Override
    public String strValue() {
        PString tempAccum = accum;
        LazySequence<T> tempLazySequence = lazySequence;
        while(tempLazySequence.hasHead()) {
            tempAccum = biFunction.apply(tempAccum, tempLazySequence.head());
            tempLazySequence = tempLazySequence.next();
        }
        return tempAccum.strValue();
    }

    private final LazySequence<T> lazySequence;
    private final BiFunction<PString, T, PString> biFunction;
    private final PString accum;
}
