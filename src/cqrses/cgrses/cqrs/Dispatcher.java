package cqrses.cgrses.cqrs;

public interface Dispatcher<T extends Dispatchable> {

    void dispatch(T dispatchable);
}
