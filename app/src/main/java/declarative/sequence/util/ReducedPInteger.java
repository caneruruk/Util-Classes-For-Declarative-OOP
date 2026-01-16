package declarative.sequence.util;

import java.util.function.BiFunction;
import declarative.primitive.interfaces.PInteger;
import declarative.sequence.interfaces.LazySequence;

final public class ReducedPInteger<T> implements PInteger {
    public ReducedPInteger(final LazySequence<T> lazySequence, final BiFunction<PInteger, T, PInteger> biFunction, final PInteger accum) {
        this.lazySequence = lazySequence;
        this.biFunction = biFunction;
        this.accum = accum;
    }

    @Override
    public int intValue() {
        PInteger tempAccum = accum;
        LazySequence<T> tempLazySequence = lazySequence;
        while(tempLazySequence.hasHead()) {
            tempAccum = biFunction.apply(tempAccum, tempLazySequence.head());
            tempLazySequence = tempLazySequence.next();
        }
        return tempAccum.intValue();
    }

    private final LazySequence<T> lazySequence;
    private final BiFunction<PInteger, T, PInteger> biFunction;
    private final PInteger accum;
}
