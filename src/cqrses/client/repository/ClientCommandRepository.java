package cqrses.client.repository;

import cqrses.client.model.Client;

import java.util.UUID;

public interface ClientCommandRepository {

    void create(Client client);

    void update(Client client);

    void delete(UUID clientid);

}
