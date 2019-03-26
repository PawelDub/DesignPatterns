package cqrses.client.command;

import cqrses.cgrses.cqrs.Command;
import cqrses.client.model.Client;

public class CreateClientCommand extends Command {

    private Client client;

    public CreateClientCommand(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
}
