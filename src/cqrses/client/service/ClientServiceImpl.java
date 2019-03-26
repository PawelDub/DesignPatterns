package cqrses.client.service;

import cqrses.cgrses.cqrs.CommandDispatcher;
import cqrses.client.command.CreateClientCommand;
import cqrses.client.command.DeleteClientCommand;
import cqrses.client.command.UpdateClientCommand;
import cqrses.client.model.Client;
import cqrses.client.model.ClientDto;
import cqrses.client.repository.ClientQueryRepository;
import cqrses.client.repository.ClientQueryRepositoryImpl;

import java.util.List;
import java.util.UUID;

public class ClientServiceImpl implements ClientService {

    ClientQueryRepository clientQueryRepository = new ClientQueryRepositoryImpl();
    CommandDispatcher commandDispatcher;

    public ClientServiceImpl(CommandDispatcher commandDispatcher) {
        this.commandDispatcher = commandDispatcher;
    }

    @Override
    public void add(ClientDto clientDto) {
        UUID clientId = UUID.randomUUID();
        Client client = new Client(clientId, clientDto.getName(), clientDto.getSurname(), null, null, null);
        commandDispatcher.dispatch(new CreateClientCommand(client));
    }

    @Override
    public void update(Client client) {
        commandDispatcher.dispatch(new UpdateClientCommand(client));
    }

    @Override
    public void delete(UUID clientId) {
        commandDispatcher.dispatch(new DeleteClientCommand(clientId));
    }

    @Override
    public Client getByid(UUID clientid) {
        return clientQueryRepository.getById(clientid);
    }

    @Override
    public List<Client> getAllClients() {
        return clientQueryRepository.getAllClients();
    }
}
