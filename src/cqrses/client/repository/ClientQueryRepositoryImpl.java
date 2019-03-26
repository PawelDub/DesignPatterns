package cqrses.client.repository;

import cqrses.client.model.Client;

import java.util.List;
import java.util.UUID;

public class ClientQueryRepositoryImpl implements ClientQueryRepository {
    @Override
    public Client getById(UUID clientId) {
        Client client = new Client(clientId, "Franek", "Kimono", 48, 1.75, 86.1);
        System.out.println("Query Repository: get client by id : " + client.toString());
        return client;
    }

    @Override
    public List<Client> getAllClients() {
        List<Client> clients = List.of(new Client(UUID.randomUUID(), "Franek", "Kimmono", 48, 1.75, 86.1), new Client(UUID.randomUUID(), "Leszek", "Leszczyński", 32, 1.56, 114.6));
        System.out.println("Query Repository: get all clients : " + clients.toString());
        return clients;
    }
}
