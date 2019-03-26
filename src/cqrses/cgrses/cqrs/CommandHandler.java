package cqrses.cgrses.cqrs;

public interface CommandHandler<T extends Command> extends Handler<T> {

}
