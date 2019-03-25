package cqrs.client.repository;

import cqrs.client.model.Client;

import java.util.List;
import java.util.UUID;

public interface ClientQueryRepository {

    Client getById(UUID clientId);

    List<Client> getAllClients();
}
