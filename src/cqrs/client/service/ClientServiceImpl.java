package cqrs.client.service;

import cqrs.cgrs.CommandBus;
import cqrs.cgrs.CommandDispatcher;
import cqrs.client.command.CreateClientCommand;
import cqrs.client.command.DeleteClientCommand;
import cqrs.client.command.UpdateClientCommand;
import cqrs.client.model.Client;
import cqrs.client.model.ClientDto;
import cqrs.client.repository.ClientQueryRepository;
import cqrs.client.repository.ClientQueryRepositoryImpl;

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
