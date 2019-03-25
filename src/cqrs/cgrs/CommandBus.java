package cqrs.cgrs;

import java.util.Map;

public class CommandBus extends Bus<Command, CommandHandler<? extends Command>> implements CommandDispatcher {

    public CommandBus(Map<Class, CommandHandler<? extends Command>> handlers) {
        super(handlers);
    }
}
