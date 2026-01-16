package declarative.sequence.util;

import java.util.function.BiFunction;
import declarative.primitive.interfaces.PDouble;
import declarative.sequence.interfaces.LazySequence;

final public class ReducedPDouble<T> implements PDouble {
    public ReducedPDouble(final LazySequence<T> lazySequence, final BiFunction<PDouble, T, PDouble> biFunction, final PDouble accum) {
        this.lazySequence = lazySequence;
        this.biFunction = biFunction;
        this.accum = accum;
    }

    @Override
    public double doubleValue() {
        PDouble tempAccum = accum;
        LazySequence<T> tempLazySequence = lazySequence;
        while(tempLazySequence.hasHead()) {
            tempAccum = biFunction.apply(tempAccum, tempLazySequence.head());
            tempLazySequence = tempLazySequence.next();
        }
        return tempAccum.doubleValue();
    }

    private final LazySequence<T> lazySequence;
    private final BiFunction<PDouble, T, PDouble> biFunction;
    private final PDouble accum;
}
