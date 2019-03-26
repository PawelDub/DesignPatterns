package cqrses.cgrses.cqrs;

public interface Handler<T extends Dispatchable> {

        void handle(T dispatchable);
}
