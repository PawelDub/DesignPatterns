package cqrses.cgrses.es;

import cqrses.cgrses.cqrs.Bus;

import java.util.Map;

public class EventBus extends Bus<Event, EventHandler<? extends Event>> implements EventDispatcher{

    public EventBus(Map<Class, EventHandler<? extends Event>> handlers) {
        super(handlers);
    }
}
