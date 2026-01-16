package declarative.sequence;

import java.util.function.Predicate;

import declarative.primitive.interfaces.PBoolean;
import declarative.sequence.interfaces.Head;
import declarative.sequence.interfaces.LazySequence;
import declarative.sequence.interfaces.Next;
import declarative.sequence.util.FirstMatch;
import declarative.sequence.util.HasMatch;

final public class Filtered<T> implements LazySequence<T> {
    public Filtered(final LazySequence<T> lazySequence, final Predicate<T> predicate) {
        this(
            new HasMatch<>(lazySequence, predicate),
            new Next<T>() {
                @Override
                public LazySequence<T> asLazySequence() {
                    LazySequence<T> tempLazySequence = lazySequence;
                    while(tempLazySequence.hasHead()) {
                        if(predicate.test(tempLazySequence.head()))
                            return new Filtered<>(tempLazySequence.next(), predicate);
                        tempLazySequence = tempLazySequence.next();
                    }

                    return new Filtered<>(lazySequence, predicate);
                }
            },
            new FirstMatch<>(lazySequence, predicate)
        );
    }

    public Filtered(final PBoolean hasHead, final Next<T> next, final Head<T> head) {
        this.hasHead = hasHead;
        this.next = next;
        this.head = head;
    }

    @Override
    public boolean hasHead() {
        return hasHead.boolValue();
    }

    @Override
    public LazySequence<T> next() {
        return next.asLazySequence();
    }

    @Override
    public T head() {
        return head.value();
    }

    private final PBoolean hasHead;
    private final Next<T> next;
    private final Head<T> head;
}
