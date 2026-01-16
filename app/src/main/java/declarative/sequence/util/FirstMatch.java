package declarative.sequence.util;

import java.util.function.Predicate;

import declarative.sequence.interfaces.Head;
import declarative.sequence.interfaces.LazySequence;

final public class FirstMatch<T> implements Head<T> {
    public FirstMatch(final LazySequence<T> lazySequence, final Predicate<T> predicate) {
        this.lazySequence = lazySequence;
        this.predicate = predicate;
    }

    @Override
    public T value() {
        LazySequence<T> tempLazySequence = lazySequence;
        while(tempLazySequence.hasHead()) {
            final T currentItem = tempLazySequence.head();
            if(predicate.test(currentItem))
                return currentItem;
            tempLazySequence = tempLazySequence.next();
        }

        return lazySequence.head();
    }

    private final LazySequence<T> lazySequence;
    private final Predicate<T> predicate;
}
