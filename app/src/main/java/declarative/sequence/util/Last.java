package declarative.sequence.util;

import declarative.sequence.interfaces.Head;
import declarative.sequence.interfaces.LazySequence;

final public class Last<T> implements Head<T> {
    public Last(final LazySequence<T> lazySequence) {
        this.lazySequence = lazySequence;
    }

    @Override
    public T value() {
        if(!lazySequence.next().hasHead()) {
            return lazySequence.head();
        }

        LazySequence<T> tempLazySequence = lazySequence;
        
        while(tempLazySequence.next().hasHead()) {
            tempLazySequence = tempLazySequence.next();
        }

        return tempLazySequence.head();
    }

    private final LazySequence<T> lazySequence;
}
