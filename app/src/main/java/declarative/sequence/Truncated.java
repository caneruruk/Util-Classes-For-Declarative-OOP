package declarative.sequence;

import declarative.primitive.interfaces.PBoolean;
import declarative.sequence.interfaces.Head;
import declarative.sequence.interfaces.LazySequence;
import declarative.sequence.interfaces.Next;
import declarative.sequence.util.LazySequenceHead;
import declarative.sequence.util.NextLazySequenceHasHead;

final public class Truncated<T> implements LazySequence<T> {
    public Truncated(final LazySequence<T> lazySequence) {
        this(
            new NextLazySequenceHasHead<>(lazySequence),
            new Next<>() {
                @Override
                public LazySequence<T> asLazySequence() {
                    return new Truncated<>(lazySequence.next());
                }
            },
            new LazySequenceHead<>(lazySequence)
        );
    }

    public Truncated(final PBoolean hasHead, final Next<T> next, final Head<T> head) {
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
