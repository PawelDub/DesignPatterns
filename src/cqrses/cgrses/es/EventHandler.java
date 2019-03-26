package cqrses.cgrses.es;

import cqrses.cgrses.cqrs.Handler;

public interface EventHandler<T extends Event> extends Handler<T> {

    void handle(T dispatchable);

}
