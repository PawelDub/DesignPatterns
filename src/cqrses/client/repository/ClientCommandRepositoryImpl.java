package cqrses.client.repository;

import cqrses.client.model.Client;

import java.util.UUID;

public class ClientCommandRepositoryImpl implements ClientCommandRepository{

    public ClientCommandRepositoryImpl() {
        System.out.println("ClientCommandRepositoryImpl");
    }

    @Override
    public void create(Client client) {
        System.out.println("Command Repository: Create client: " + client.toString());
    }

    @Override
    public void update(Client client) {
        System.out.println("Command Repository: Update client: " + client.toString());
    }

    @Override
    public void delete(UUID clientid) {
        System.out.println("Command Repository: Delete client: " + clientid);
    }
}
