package cqrses.cgrses.es;

import cqrses.cgrses.cqrs.Dispatcher;

public interface EventDispatcher extends Dispatcher<Event> {

    void dispatch(Event dispatchable);

}
