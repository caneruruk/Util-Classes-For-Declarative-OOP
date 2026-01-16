package declarative.sequence.util;

import java.util.function.BiFunction;
import declarative.primitive.interfaces.PShort;
import declarative.sequence.interfaces.LazySequence;

final public class ReducedPShort<T> implements PShort {
    public ReducedPShort(final LazySequence<T> lazySequence, final BiFunction<PShort, T, PShort> biFunction, final PShort accum) {
        this.lazySequence = lazySequence;
        this.biFunction = biFunction;
        this.accum = accum;
    }

    @Override
    public short shortValue() {
        PShort tempAccum = accum;
        LazySequence<T> tempLazySequence = lazySequence;
        while(tempLazySequence.hasHead()) {
            tempAccum = biFunction.apply(tempAccum, tempLazySequence.head());
            tempLazySequence = tempLazySequence.next();
        }
        return tempAccum.shortValue();
    }

    private final LazySequence<T> lazySequence;
    private final BiFunction<PShort, T, PShort> biFunction;
    private final PShort accum;
}
