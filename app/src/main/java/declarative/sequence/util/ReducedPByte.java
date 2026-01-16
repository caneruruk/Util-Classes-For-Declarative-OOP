package declarative.sequence.util;

import java.util.function.BiFunction;
import declarative.primitive.interfaces.PByte;
import declarative.sequence.interfaces.LazySequence;

final public class ReducedPByte<T> implements PByte {
    public ReducedPByte(final LazySequence<T> lazySequence, final BiFunction<PByte, T, PByte> biFunction, final PByte accum) {
        this.lazySequence = lazySequence;
        this.biFunction = biFunction;
        this.accum = accum;
    }

    @Override
    public byte byteValue() {
        PByte tempAccum = accum;
        LazySequence<T> tempLazySequence = lazySequence;
        while(tempLazySequence.hasHead()) {
            tempAccum = biFunction.apply(tempAccum, tempLazySequence.head());
            tempLazySequence = tempLazySequence.next();
        }
        return tempAccum.byteValue();
    }

    private final LazySequence<T> lazySequence;
    private final BiFunction<PByte, T, PByte> biFunction;
    private final PByte accum;
}
