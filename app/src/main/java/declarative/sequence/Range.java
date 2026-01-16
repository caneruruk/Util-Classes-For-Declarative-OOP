package declarative.sequence;

import declarative.primitive.arithmetic.PLongAdd;
import declarative.primitive.choice.PBooleanChoice;
import declarative.primitive.comparison.PLongIsLessThan;
import declarative.primitive.comparison.PLongIsMoreThan;
import declarative.primitive.conversion.LongAsPLong;
import declarative.primitive.interfaces.PBoolean;
import declarative.primitive.interfaces.PLong;
import declarative.sequence.interfaces.Head;
import declarative.sequence.interfaces.LazySequence;
import declarative.sequence.interfaces.Next;

final public class Range implements LazySequence<Long> {
    public Range(final PLong source, final PLong target, final PLong step) {
        this(
            new PBooleanChoice(
                new PLongIsMoreThan(step, new LongAsPLong(0)), 
                new PLongIsLessThan(source, target), 
                new PLongIsMoreThan(source, target)
            ),
            new Next<Long>() {
                @Override
                public LazySequence<Long> asLazySequence() {
                    return new Range(new PLongAdd(source, step), target, step);
                }
            },
            new Head<Long>() {
                public Long value() {
                    return source.longValue();
                }
            }
        );
    }

    public Range(final PBoolean hasHead, final Next<Long> next, final Head<Long> head) {
        this.hasHead = hasHead;
        this.next = next;
        this.head = head;
    }

    @Override
    public boolean hasHead() {
        return hasHead.boolValue();
    }

    @Override
    public LazySequence<Long> next() {
        return next.asLazySequence();
    }

    @Override
    public Long head() {
        return head.value();
    }

    private final PBoolean hasHead;
    private final Next<Long> next;
    private final Head<Long> head;
}
