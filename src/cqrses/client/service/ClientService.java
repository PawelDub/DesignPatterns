package cqrses.client.service;

import cqrses.client.model.Client;
import cqrses.client.model.ClientDto;

import java.util.List;
import java.util.UUID;

public interface ClientService {

    void add(ClientDto client);

    void update(Client client);

    void delete(UUID clientId);

    Client getByid(UUID clientid);

    List<Client> getAllClients();
}
