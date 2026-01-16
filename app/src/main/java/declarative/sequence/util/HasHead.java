package declarative.sequence.util;

import declarative.primitive.interfaces.PBoolean;
import declarative.sequence.interfaces.LazySequence;

final public class HasHead<T> implements PBoolean {
    public HasHead(final LazySequence<T> lazySequence) {
        this.lazySequence = lazySequence;
    }

    @Override
    public boolean boolValue() {
        return lazySequence.hasHead();
    }

    private final LazySequence<T> lazySequence;
}
