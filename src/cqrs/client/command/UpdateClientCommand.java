package cqrs.client.command;

import cqrs.cgrs.Command;
import cqrs.client.model.Client;

public class UpdateClientCommand extends Command {

    private Client client;

    public UpdateClientCommand(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
}
