package cqrs.cgrs;

public interface Handler<T extends Dispatchable> {

        void handle(T dispatchable);
}
