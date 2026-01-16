package declarative.sequence;

import declarative.primitive.arithmetic.PBooleanAnd;
import declarative.primitive.arithmetic.PLongSub;
import declarative.primitive.comparison.PLongIsMoreThan;
import declarative.primitive.conversion.LongAsPLong;
import declarative.primitive.interfaces.PBoolean;
import declarative.primitive.interfaces.PLong;
import declarative.sequence.interfaces.Head;
import declarative.sequence.interfaces.LazySequence;
import declarative.sequence.interfaces.Next;
import declarative.sequence.util.HasHead;
import declarative.sequence.util.LazySequenceHead;

final public class Taken<T> implements LazySequence<T> {
    public Taken(final LazySequence<T> lazySequence, final PLong target) {
        this(
            new PBooleanAnd(
                new PLongIsMoreThan(
                    target,
                    new LongAsPLong(0)
                ),
                new HasHead<>(lazySequence)
            ),
            new Next<T>() {
                @Override
                public LazySequence<T> asLazySequence() {
                    return new Taken<T>(lazySequence.next(), new PLongSub(target, new LongAsPLong(1)));
                }
            },
            new LazySequenceHead<>(lazySequence)
        );
    }

    public Taken(final PBoolean hasHead, final Next<T> next, final Head<T> head) {
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
