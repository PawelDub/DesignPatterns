package cqrses.client.handler;

import cqrses.cgrses.cqrs.CommandHandler;
import cqrses.client.command.UpdateClientCommand;
import cqrses.client.repository.ClientCommandRepositoryImpl;

public class UpdateClientHandler implements CommandHandler<UpdateClientCommand> {

    ClientCommandRepositoryImpl clientCommandRepository;

    public UpdateClientHandler() {
        System.out.println("1 UpdateClientHandler");
    }

    public UpdateClientHandler(ClientCommandRepositoryImpl clientCommandRepository) {
        System.out.println("2 UpdateClientHandler");
        this.clientCommandRepository = clientCommandRepository;
    }


    @Override
    public void handle(UpdateClientCommand dispatchable) {
        clientCommandRepository.update(dispatchable.getClient());
    }
}
