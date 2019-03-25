package cqrs.client.command;

import cqrs.cgrs.Command;
import cqrs.client.model.Client;

public class CreateClientCommand extends Command {

    private Client client;

    public CreateClientCommand(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
}
