package cqrses.client.command;

import cqrses.cgrses.cqrs.Command;
import cqrses.client.model.Client;

public class UpdateClientCommand extends Command {

    private Client client;

    public UpdateClientCommand(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
}
