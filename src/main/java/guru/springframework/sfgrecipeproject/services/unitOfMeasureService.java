package guru.springframework.sfgrecipeproject.services;

import guru.springframework.sfgrecipeproject.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface unitOfMeasureService {
     Set<UnitOfMeasureCommand> listAllUoms();
}
