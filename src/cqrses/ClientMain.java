package cqrses;

import cqrses.cgrses.cqrs.Command;
import cqrses.cgrses.cqrs.CommandBus;
import cqrses.cgrses.cqrs.CommandHandler;
import cqrses.client.command.CreateClientCommand;
import cqrses.client.command.DeleteClientCommand;
import cqrses.client.command.UpdateClientCommand;
import cqrses.client.handler.CreateClientHandler;
import cqrses.client.handler.DeleteClientHandler;
import cqrses.client.handler.UpdateClientHandler;
import cqrses.client.model.Client;
import cqrses.client.model.ClientDto;
import cqrses.client.repository.ClientCommandRepositoryImpl;
import cqrses.client.service.ClientService;
import cqrses.client.service.ClientServiceImpl;

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
