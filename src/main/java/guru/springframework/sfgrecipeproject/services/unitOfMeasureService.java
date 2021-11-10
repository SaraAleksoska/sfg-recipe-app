package guru.springframework.sfgrecipeproject.services;

import guru.springframework.sfgrecipeproject.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface unitOfMeasureService {
    static Set<UnitOfMeasureCommand> listAllUoms();
}
