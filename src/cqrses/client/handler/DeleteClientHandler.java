package cqrses.client.handler;

import cqrses.cgrses.cqrs.CommandHandler;
import cqrses.client.command.DeleteClientCommand;
import cqrses.client.repository.ClientCommandRepositoryImpl;

public class DeleteClientHandler implements CommandHandler<DeleteClientCommand> {

    ClientCommandRepositoryImpl clientCommandRepository;

    public DeleteClientHandler () {
        System.out.println("1 DeleteClientHandler");
    }

    public DeleteClientHandler (ClientCommandRepositoryImpl clientCommandRepository) {
        System.out.println("2 DeleteClientHandler");
        this.clientCommandRepository = clientCommandRepository;
    }


    @Override
    public void handle(DeleteClientCommand dispatchable) {
        clientCommandRepository.delete(dispatchable.getClientId());
    }
}
