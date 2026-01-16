package declarative.sequence.util;

import declarative.sequence.interfaces.Head;

final public class FirstItemInArray<T> implements Head<T> {
    public FirstItemInArray(final T[] array) {
        this.array = array;
    }

    @Override
    public T value() {
        return array[0];
    }

    private final T[] array;
}
