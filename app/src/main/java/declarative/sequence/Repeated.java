package declarative.sequence;

import declarative.sequence.interfaces.LazySequence;

final public class Repeated<T> implements LazySequence<T> {
    public Repeated(final T item) {
        this.item = item;
    }

    @Override
    public boolean hasHead() {
        return true;
    }

    @Override
    public LazySequence<T> next() {
        return this;
    }

    @Override
    public T head() {
        return item;
    }

    private final T item;
}
