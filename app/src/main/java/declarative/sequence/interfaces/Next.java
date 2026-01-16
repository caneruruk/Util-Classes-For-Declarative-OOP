package declarative.sequence.interfaces;

public interface Next<T> {
    LazySequence<T> asLazySequence();
}
