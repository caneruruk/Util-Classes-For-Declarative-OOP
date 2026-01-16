package declarative.sequence.util;

import java.util.function.BiFunction;
import declarative.primitive.interfaces.PFloat;
import declarative.sequence.interfaces.LazySequence;

final public class ReducedPFloat<T> implements PFloat {
    public ReducedPFloat(final LazySequence<T> lazySequence, final BiFunction<PFloat, T, PFloat> biFunction, final PFloat accum) {
        this.lazySequence = lazySequence;
        this.biFunction = biFunction;
        this.accum = accum;
    }

    @Override
    public float floatValue() {
        PFloat tempAccum = accum;
        LazySequence<T> tempLazySequence = lazySequence;
        while(tempLazySequence.hasHead()) {
            tempAccum = biFunction.apply(tempAccum, tempLazySequence.head());
            tempLazySequence = tempLazySequence.next();
        }
        return tempAccum.floatValue();
    }

    private final LazySequence<T> lazySequence;
    private final BiFunction<PFloat, T, PFloat> biFunction;
    private final PFloat accum;
}
