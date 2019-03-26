package cqrses.cgrses.cqrs;

public interface CommandDispatcher extends Dispatcher<Command> {

    void dispatch(Command command);
}
