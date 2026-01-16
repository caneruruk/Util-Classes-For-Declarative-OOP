package declarative.sequence.util;

import java.util.function.BiFunction;

import declarative.primitive.interfaces.PBoolean;
import declarative.sequence.interfaces.LazySequence;

final public class ReducedPBoolean<T> implements PBoolean {
    public ReducedPBoolean(final LazySequence<T> lazySequence, final BiFunction<PBoolean, T, PBoolean> biFunction, final PBoolean accum) {
        this.lazySequence = lazySequence;
        this.biFunction = biFunction;
        this.accum = accum;
    }

    @Override
    public boolean boolValue() {
        PBoolean tempAccum = accum;
        LazySequence<T> tempLazySequence = lazySequence;
        while(tempLazySequence.hasHead()) {
            tempAccum = biFunction.apply(tempAccum, tempLazySequence.head());
            tempLazySequence = tempLazySequence.next();
        }
        return tempAccum.boolValue();
    }

    private final LazySequence<T> lazySequence;
    private final BiFunction<PBoolean, T, PBoolean> biFunction;
    private final PBoolean accum;
}
