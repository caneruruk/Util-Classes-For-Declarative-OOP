package declarative.sequence.util;

import java.util.function.Consumer;

import declarative.sequence.interfaces.LazySequence;

final public class ForEach<T> implements Runnable {
    public ForEach(final LazySequence<T> lazySequence, final Consumer<T> consumer) {
        this.lazySequence = lazySequence;
        this.consumer = consumer;
    }

    @Override
    public void run() {
        LazySequence<T> tempLazySequence = lazySequence;
        while(tempLazySequence.hasHead()) {
            consumer.accept(tempLazySequence.head());
            tempLazySequence = tempLazySequence.next();
        }
    }

    private final LazySequence<T> lazySequence;
    private final Consumer<T> consumer;
}
