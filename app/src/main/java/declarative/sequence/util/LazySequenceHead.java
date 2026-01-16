package declarative.sequence.util;

import declarative.sequence.interfaces.Head;
import declarative.sequence.interfaces.LazySequence;

final public class LazySequenceHead<T> implements Head<T> {
    public LazySequenceHead(final LazySequence<T> lazySequence) {
        this.lazySequence = lazySequence;
    }

    @Override
    public T value() {
        return lazySequence.head();
    }

    private final LazySequence<T> lazySequence;
}
