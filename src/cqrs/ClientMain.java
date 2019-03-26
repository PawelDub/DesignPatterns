package cqrs;

import cqrs.cgrs.Command;
import cqrs.cgrs.CommandBus;
import cqrs.cgrs.CommandHandler;
import cqrs.client.command.CreateClientCommand;
import cqrs.client.command.DeleteClientCommand;
import cqrs.client.command.UpdateClientCommand;
import cqrs.client.handler.CreateClientHandler;
import cqrs.client.handler.DeleteClientHandler;
import cqrs.client.handler.UpdateClientHandler;
import cqrs.client.model.Client;
import cqrs.client.model.ClientDto;
import cqrs.client.repository.ClientCommandRepositoryImpl;
import cqrs.client.service.ClientService;
import cqrs.client.service.ClientServiceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ClientMain {

    private static Map<Class, CommandHandler<? extends Command>> handlers;

    static {
        handlers = prepare();
    }

    private static Map<Class, CommandHandler<? extends Command>> prepare() {
        ClientCommandRepositoryImpl clientCommandRepository = new ClientCommandRepositoryImpl();

        CommandHandler createClientHandler = new CreateClientHandler(clientCommandRepository);
        CommandHandler updateClientHandler = new UpdateClientHandler(clientCommandRepository);
        CommandHandler deleteClientHandler = new DeleteClientHandler(clientCommandRepository);

        Map<Class, CommandHandler<? extends Command>> handlers = new HashMap<>();
        handlers.put(CreateClientCommand.class, createClientHandler);
        handlers.put(UpdateClientCommand.class, updateClientHandler);
        handlers.put(DeleteClientCommand.class, deleteClientHandler);

        return handlers;
    }


    public static void main(String[] args) {

        CommandBus commandBus = new CommandBus(handlers);

        ClientDto clientDto = new ClientDto("Franek", "Kimono");
        ClientService clientService = new ClientServiceImpl(commandBus);
        clientService.add(clientDto);

        Client client = new Client(UUID.randomUUID(), clientDto.getName(), clientDto.getSurname(), 48, 1.78, 114.9);
        clientService.update(client);

        clientService.delete(client.getId());

        clientService.getByid(client.getId());

        clientService.getAllClients();

    }
}
