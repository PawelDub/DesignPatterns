package cqrses.client.command;

import cqrses.cgrses.cqrs.Command;

import java.util.UUID;

public class DeleteClientCommand extends Command {

    private UUID clientId;

    public DeleteClientCommand(UUID clientId) {
        this.clientId = clientId;
    }

    public UUID getClientId() {
        return clientId;
    }
}
