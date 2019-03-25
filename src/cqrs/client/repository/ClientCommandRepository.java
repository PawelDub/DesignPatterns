package cqrs.client.repository;

import cqrs.client.model.Client;

import java.util.UUID;

public interface ClientCommandRepository {

    void create(Client client);

    void update(Client client);

    void delete(UUID clientid);

}
