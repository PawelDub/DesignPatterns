package cqrs.client.handler;

import cqrs.cgrs.CommandHandler;
import cqrs.client.command.CreateClientCommand;
import cqrs.client.repository.ClientCommandRepositoryImpl;

public class CreateClientHandler implements CommandHandler<CreateClientCommand> {

    ClientCommandRepositoryImpl clientCommandRepository;

    public CreateClientHandler() {
        System.out.println("1 CreateClientHandler");
    }

    public CreateClientHandler(ClientCommandRepositoryImpl clientCommandRepository) {
        System.out.println("2 CreateClientHandler");
        this.clientCommandRepository = clientCommandRepository;
    }


    @Override
    public void handle(CreateClientCommand dispatchable) {
        clientCommandRepository.create(dispatchable.getClient());
    }
}
